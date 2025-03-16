package Tree;

public class SumOfBinaryTree {
    public static void main(String[] args) {

    }

    public static void sum(Node root , int n){
        if(root==null){
            return;
        }
        n=n+1;
        sum(root.left,n);
        sum(root.right,n);
    }

    public static int total(Node root){
        if(root==null){
            return 0;
        }
        return root.data+total(root.left)+total(root.right);
    }
}
