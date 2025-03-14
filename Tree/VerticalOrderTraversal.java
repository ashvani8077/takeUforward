package Tree;

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<int[]>> positive = new ArrayList<>();
        List<List<int[]>> negative = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        int bounds[] = new int[2];
        find(bounds, 0, root);
        int l = bounds[0];
        int r = bounds[1];

        for (int i = 0; i < r + 1; i++) {
            positive.add(new ArrayList<>());
        }
        for (int i = 0; i < Math.abs(l) + 1; i++) {
            negative.add(new ArrayList<>());
        }

        Queue<Node> q = new ArrayDeque<>();
        Queue<int[]> index = new ArrayDeque<>();
        q.add(root);
        index.add(new int[]{0, 0}); // {row, col}

        while (!q.isEmpty()) {
            Node temp = q.poll();
            int[] pos = index.poll();
            int row = pos[0];
            int col = pos[1];

            if (col >= 0) {
                positive.get(col).add(new int[]{row, temp.data});
            } else {
                negative.get(Math.abs(col)).add(new int[]{row, temp.data});
            }

            if (temp.left != null) {
                q.add(temp.left);
                index.add(new int[]{row + 1, col - 1});
            }
            if (temp.right != null) {
                q.add(temp.right);
                index.add(new int[]{row + 1, col + 1});
            }
        }

        // Sort and add negative columns first
        for (int i = negative.size() - 1; i >= 0; i--) {
            if (!negative.get(i).isEmpty()) {
                negative.get(i).sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
                List<Integer> sortedCol = new ArrayList<>();
                for (int[] pair : negative.get(i)) {
                    sortedCol.add(pair[1]);
                }
                ans.add(sortedCol);
            }
        }

        // Sort and add positive columns
        for (int i = 0; i < positive.size(); i++) {
            if (!positive.get(i).isEmpty()) {
                positive.get(i).sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
                List<Integer> sortedCol = new ArrayList<>();
                for (int[] pair : positive.get(i)) {
                    sortedCol.add(pair[1]);
                }
                ans.add(sortedCol);
            }
        }

        return ans;
    }

    public static void find(int arr[], int pos, Node root) {
        if (root == null) {
            return;
        }
        arr[0] = Math.min(arr[0], pos);
        arr[1] = Math.max(arr[1], pos);
        find(arr, pos - 1, root.left);
        find(arr, pos + 1, root.right);
    }
}