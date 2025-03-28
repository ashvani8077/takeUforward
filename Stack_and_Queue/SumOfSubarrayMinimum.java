package Stack_and_Queue;

import java.util.Stack;

public class SumOfSubarrayMinimum {
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
    }
//    public static int sumMinimum(int arr[]){
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            int min=arr[i];
//            for(int j=i;j<arr.length;j++){
//                min=Math.min(min,arr[j]);
//                sum+=min;
//            }
//        }
//        return sum;
//    }

    public static int sumMinimum(int arr[]){
        int mod = 1000000007;
        int[] nse = nextSmallerElement(arr);
        int[] pse = previousSmallerElement(arr);
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (right * left % mod) * arr[i] % mod) % mod;
        }

        return (int) total;
    }

    public static int[] nextSmallerElement(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nse[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }

        return nse;
    }

    public static int[] previousSmallerElement(int[] arr) {
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }
}
