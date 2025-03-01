package BinarySearchTree;

public class CeilInBST {
    public static void main(String[] args) {

    }

    public static int ceil(Node root, int x) {
        return answer(root, x);
    }

    public static int answer(Node root, int x) {

        if (root == null) {
            return -1;
        }

        int left = answer(root.left, x);

        if (root.data == x) {
            return x;
        }

        if (root.right != null && root.right.data >= x) {
            return answer(root.right, x);
        }

        return (left >= x) ? left : root.data;
    }
}
