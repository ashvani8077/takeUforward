package Tree;

public class PreorderTraversal {
    public static void main(String[] args) {

    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
