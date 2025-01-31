package Tree;

import java.util.ArrayList;
import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<List<Integer>>  levelOrder(Node root){

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node temp = queue.poll();
                currentLevel.add(temp.data);

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}
