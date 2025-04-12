package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChocolate {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 5, 2};
        int a = 3;
        System.out.println(solution(arr, a));
    }

    public static int solution(int arr[], int a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : arr) {
            pq.add(i);
        }

        long chocolate = 0;
        int MOD = 1000000007;

        while (a > 0 && !pq.isEmpty()) {
            int maxChoco = pq.poll();
            chocolate = (chocolate + maxChoco) % MOD;

            if (maxChoco / 2 > 0) {
                pq.add(maxChoco / 2);
            }

            a--;
        }

        return (int) chocolate;
    }
}
