package Tree;

public class CountNonLeafNode {
    public static void main(String[] args) {

    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        return 1+(count(root.left)+count(root.right));
    }
}
