package Heap;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public static void main(String[] args) {
        int arr[]={4, 2, 7, 6, 9};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        int total=0;
        while (pq.size()!=1){
            int a=pq.poll();
            int b=pq.poll();
            int sum=a+b;
            total+=sum;
            pq.add(sum);
        }
        return total;
    }
}
