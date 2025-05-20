package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProfitMaximization {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int k=3;
        System.out.println(solution(k,arr));
    }
    public static int solution(int k,int arr[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int profit=0;
        for(int i:arr){
            pq.add(i);
        }
        while (k>0&&!pq.isEmpty()){
            int t=pq.poll();
            profit+=t;
            pq.add(t-1);
            k--;
        }
        return profit;
    }
}
