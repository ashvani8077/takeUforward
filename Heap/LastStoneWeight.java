package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int arr[]={2,7,4,1,8,1};
        System.out.println(lastStone(arr));
    }
    public static int lastStone(int arr[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.add(i);
        }
        while (pq.size()>1){
            int weight=pq.poll();
            weight=weight-pq.poll();
            if(weight>0){
                pq.add(weight);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }
}
