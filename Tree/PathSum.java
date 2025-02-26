package Tree;

public class PathSum {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(Node root, int s){
        return path(root,s,0);
    }
    public static boolean path(Node root, int s, int sum){
        if(root==null){
            return false;
        }
        sum+=root.data;
        if(root.left==null&&root.right==null&&s==sum){
            return true;
        }
        return path(root.left,s,sum)||path(root.right,s,sum);
    }
}
