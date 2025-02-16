package BinarySearchTree;

public class DeleteNode {
    public static void main(String[] args) {

    }
    public static Node Delete(Node root, int t) {
        if (root == null) {
            return null;
        }
        if (root.data > t) {
            root.left = Delete(root.left, t);
        } else if (root.data < t) {
            root.right = Delete(root.right, t);
        } else {
            // Case 1: Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child (left exists)
            else if (root.right == null) {
                return root.left;
            }
            // Case 3: One child (right exists)
            else if (root.left == null) {
                return root.right;
            }
            // Case 4: Two children - Find in-order predecessor (largest in left subtree)
            else {
                Node child = root.left;
                Node parent = root;
                while (child.right != null) {
                    parent = child;
                    child = child.right;
                }

                if (parent != root) {
                    parent.right = child.left;
                    child.left = root.left;
                }

                child.right = root.right;
                return child;
            }
        }
        return root;
    }
}
