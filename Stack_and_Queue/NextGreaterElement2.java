package Stack_and_Queue;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int arr[]={1,2,1};
    }
//    public static int [] ngeBrute(int arr[]){
//        int ans[]=new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            ans[i]=-1;
//            for (int j=i+1;j<=i+arr.length-1;j++){
//                int ind=j%arr.length;
//                if(arr[ind]>arr[i]){
//                    ans[i]=arr[ind];
//                    break;
//                }
//            }
//        }
//        return ans;
//    }


    public static int [] ngeOptimal(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while (!st.empty()&&st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                res[i]=st.empty()?-1:st.peek();
            }
            st.push(arr[i%n]);
        }
        return res;
    }
}
