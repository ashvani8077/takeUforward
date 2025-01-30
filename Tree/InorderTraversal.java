package Tree;

public class InorderTraversal {
    public static void main(String[] args) {

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
