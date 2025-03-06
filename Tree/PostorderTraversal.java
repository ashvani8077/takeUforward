package Tree;

public class PostorderTraversal {
    public static void main(String[] args) {

    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}
