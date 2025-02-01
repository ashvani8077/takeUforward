package Tree;

public class MaximumHeightOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
