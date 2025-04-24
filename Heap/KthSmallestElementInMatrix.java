package Heap;

import java.util.PriorityQueue;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        System.out.println(solution(arr, 8)); // Should return 13
    }

    public static int solution(int arr[][], int k) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // Min heap based on value

        // Add first column elements with row, col information
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{arr[i][0], i, 0});
        }

        int result = 0;
        while (k > 0) {
            int[] smallest = pq.poll(); // Remove the smallest element
            result = smallest[0];
            int row = smallest[1], col = smallest[2];

            if (col + 1 < n) { // Add next element in the row
                pq.add(new int[]{arr[row][col + 1], row, col + 1});
            }
            k--;
        }

        return result;
    }
}
