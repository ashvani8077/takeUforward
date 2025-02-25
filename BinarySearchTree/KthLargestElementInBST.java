package BinarySearchTree;

public class KthLargestElementInBST {
    public static void main(String[] args) {

    }
    public static int largest(Node root, int t){
        int ans[]={-1};
        int k[]=new int[1];
        k[0]=t;

        value(root, ans, k);
        return ans[0];
    }
    public static void value(Node root, int ans[], int k[]){
        if(root==null||k[0]==0){
            return;
        }
        value(root.right, ans, k);
        k[0]--;
        if(k[0]==0){
            ans[0]=root.data;
            return;
        }
        value(root.left,ans,k);
    }
}
