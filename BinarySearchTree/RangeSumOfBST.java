package BinarySearchTree;

import java.util.List;

public class RangeSumOfBST {
    public static void main(String[] args) {

    }
    public static int sum(Node root, int n1,int n2){
        int ans[]={0};
        solution(root,ans,n1,n2);
        return ans[0];
    }
    public static void solution(Node root, int ans[],int n1,int n2){
        if(root==null){
            return;
        }
        if(root.data>n1&&root.data>n2){
            solution(root.left,ans, n1,n2);
        }
        else if(root.data<n1&&root.data>n2){
            solution(root.right, ans, n1,n2);
        }
        else{
            solution(root.left,ans, n1,n2);
            ans[0]+=root.data;
            solution(root.right,ans,n1,n2);
        }
    }
}
