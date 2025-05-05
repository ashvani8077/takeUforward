package BinarySearchTree;

public class MinimumDistanceInBST {
    public static void main(String[] args) {

    }
    public static int solution(Node root){
        int ans[]={Integer.MAX_VALUE,-1};
        value(root, ans);
        return ans[0];
    }
    public static void value(Node root, int ans[]){
        if(root==null){
            return;
        }
        value(root.left, ans);
        if(ans[1]!=-1){
            ans[0]=Math.min(ans[0],Math.abs(root.data-ans[1]));
        }
        ans[1]=root.data;
        value(root.right, ans);
    }
}
