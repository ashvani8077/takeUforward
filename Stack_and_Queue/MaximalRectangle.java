package Stack_and_Queue;

import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        int arr[][]={
                {1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
        };
        System.out.println(solution(arr));
    }
    public static int solution(int arr[][]){
        int ans=0;
        int m= arr.length;
        int n=arr[0].length;
        int prefixSum[][]=new int[m][n];
        for (int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0){
                    sum=0;
                }
                sum=sum+arr[i][j];
                prefixSum[i][j]=sum;
            }
        }
        for (int i=0;i<m;i++){
            int temp=Helper(prefixSum[i]);
            ans=Math.max(ans,temp);
        }
        return ans;
    }



    public static int Helper(int arr[]){
        Stack<Integer> st=new Stack<>();
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
