package Tree;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {

    }
        public ArrayList<Integer> bottomView(Node root) {
            ArrayList<Integer> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }

            TreeMap<Integer, Integer> mpp = new TreeMap<>();
            Queue<Node> q = new ArrayDeque<>();
            Queue<Integer> hdQ = new ArrayDeque<>();

            q.add(root);
            hdQ.add(0);

            while (!q.isEmpty()) {
                Node currNode = q.poll();
                int hd = hdQ.poll();

                mpp.put(hd, currNode.data);

                if (currNode.left != null) {
                    q.add(currNode.left);
                    hdQ.add(hd - 1);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                    hdQ.add(hd + 1);
                }
            }

            ans.addAll(mpp.values());
            return ans;
        }
    }