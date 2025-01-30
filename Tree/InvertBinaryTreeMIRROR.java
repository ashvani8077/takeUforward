package Tree;

public class InvertBinaryTreeMIRROR {
    public static void main(String[] args) {

    }
    public static void invert(Node root){
        if(root==null){
            return;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }
}
