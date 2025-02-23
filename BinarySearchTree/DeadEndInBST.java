package BinarySearchTree;

public class DeadEndInBST {
    public static void main(String[] args) {

    }
    public static boolean isDead(Node root){
        return Dead(root,0 ,Integer.MAX_VALUE);
    }

    public static boolean Dead(Node root, int lower, int upper){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            if(root.data-lower==1&&upper-root.data==1){
                return true;
            }
            else{
                return false;
            }
        }
        return Dead(root.left, lower, root.data)||Dead(root.right,root.data,upper);
    }
}
