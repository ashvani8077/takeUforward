package Stack_and_Queue;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(solution2(arr));
    }
//    public static int solution(int arr[]){
//        int max=0;
//        int nse[]=nextSmallerElement(arr);
//        int pse[]=previousSmallerElement(arr);
//        for (int i=0;i<arr.length;i++){
//            int area=(arr[i]*(nse[i]-pse[i]-1));
//            max=Math.max(max,area);
//        }
//        return max;
//    }
//
//    public static int[] nextSmallerElement(int[] arr) {
//        int[] nse = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            while (!st.empty() && arr[st.peek()] > arr[i]) {
//                st.pop();
//            }
//            nse[i] = st.empty() ? arr.length : st.peek();
//            st.push(i);
//        }
//
//        return nse;
//    }
//
//
//    public static int[] previousSmallerElement(int[] arr) {
//        int[] pse = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            while (!st.empty() && arr[st.peek()] >= arr[i]) {
//                st.pop();
//            }
//            pse[i] = st.empty() ? -1 : st.peek();
//            st.push(i);
//        }
//
//        return pse;
//    }


    public static int solution2(int arr[]){
        Stack<Integer>st=new Stack<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            while (!st.empty()&&arr[st.peek()]>arr[i]){
                int ele=arr[st.peek()];
                st.pop();
                int nse=i;
                int pse=st.empty()?-1:st.peek();
                int area=ele*(nse-pse-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while (!st.empty()){
            int ele=arr[st.peek()];
            st.pop();
            int nse=arr.length;
            int pse=st.empty()?-1:st.peek();
            int area=ele*(nse-pse-1);
            max=Math.max(max,area);
        }
        return max;

    }

}
