package BinarySearchTree;

import java.util.ArrayList;

public class CheckBST2 {
    public static void main(String[] args) {

    }
    public static boolean isBST(Node root){
        ArrayList<Integer>ans=new ArrayList<>();
        BST(root, ans);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<=ans.get(i-1)){
                return false;
            }
        }
        return true;
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
