package Tree;

public class CountLeafNode {
    public static void main(String[] args) {

    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return (count(root.left)+count(root.right));
    }

    public static void total(Node root,int n){
        if(root==null){
            return;
        }
        if(root.left!=null&&root.right!=null){
            n++;
            return;
        }
        total(root.left,n);
        total(root.right,n);

    }
}
