package Stack_and_Queue;

import java.util.Deque;
import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=solution(arr,k);
        for(int i:res){
            System.out.print(i+"  ");
        }
    }
    public static int [] solution(int arr[], int k){
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int m=0;
        Deque<Integer>dq=new ArrayDeque<Integer>() ;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while (!dq.isEmpty()&& arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[m++]=arr[dq.peekFirst()];
            }
        }
        return ans;
    }
}
