package BinarySearchTree;

public class SearchElement {
    public static void main(String[] args) {

    }
    public static boolean isPresent(Node root, int t){
        if (root==null){
            return false;
        }
        if(root.data==t){
            return true;
        }
        if(root.data>t){
            return isPresent(root.left,t);
        }
        else {
            return isPresent(root.right,t);
        }
    }
}
