package BinarySearchTree;

public class CheckBST {
    public static void main(String[] args) {

    }
    public static boolean isBST(Node root,int n){
        if(root==null){
            return true;
        }
        boolean l=isBST(root.left,n);
        if(l==false){
            return false;
        }
        if(root.data<=n){
            return false;
        }
        n=root.data;
        return isBST(root.right,n);
    }
}