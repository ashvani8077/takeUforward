package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[]={7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println(solution(k,arr));
    }
    public static int solution(int k,int arr[]){
        int l=0;
        int r=arr.length-1;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<=r;i++){
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    }
}
