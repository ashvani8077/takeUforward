package BinarySearchTree;

public class SumOfKSmallestElement {
    public static void main(String[] args) {

    }
    public static int sum(Node root, int t){
        int ans[]={0};
        int k[]=new int[1];
        k[0]=t;
        value(root, ans, k);
        return ans[0];
    }
    public static void value(Node root, int ans[], int k[]){
        if(root==null || k[0]==0){
            return;
        }
        value(root.left, ans, k);
        if(k[0]==0){
            return;
        }
        ans[0]=ans[0]+root.data;
        k[0]--;
        value(root.right,ans,k);
    }
}
