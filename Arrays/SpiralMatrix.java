package Arrays;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        ArrayList<Integer> ans = printSpiral(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> printSpiral(int arr[][]) {
        ArrayList<Integer> li = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int left = 0;
        int right = m - 1;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                li.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                li.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    li.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    li.add(arr[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}
