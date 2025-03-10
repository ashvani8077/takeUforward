package BinarySearchTree;

import java.util.ArrayList;

public class KthSmallestElementInBST {
    public static void main(String[] args) {

    }
    public static int answer(Node root, int k){
        ArrayList<Integer> ans=new ArrayList<>();
        BST(root, ans);
        return ans.get(k-1);
    }

    public static void BST(Node root, ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        BST(root.left,ans);
        ans.add(root.data);
        BST(root.right,ans);
    }
}
