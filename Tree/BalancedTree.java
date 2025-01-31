package Tree;

public class BalancedTree {
    public static void main(String[] args) {

    }

    //It may have some error
    public static boolean isValid(Node root){
        int valid=1;
        height(root,valid);
        if(valid==1){
            return true;
        }
        return false;
    }

    public static int  height(Node root,int valid){
        if(root==null){
            return 0;
        }
        int le=height(root.left,valid);
        int ri=height(root.right,valid);
        if(Math.abs(le-ri)>1){
            valid=0;
        }
        return 1+Math.max(le,ri);
    }
}
