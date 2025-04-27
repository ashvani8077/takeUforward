package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementInTwoBST {
    public static void main(String[] args) {

    }
    public static List<Integer> answer(Node root1, Node root2){
        List<Integer>li=new ArrayList<>();
        recursion(root1, li);
        recursion(root2, li);
        Collections.sort(li);
        return li;
    }

    public static void recursion(Node root,List<Integer>ans){
        if(root==null){
            return;
        }
        recursion(root.left,ans);
        ans.add(root.data);
        recursion(root.right,ans);
    }
}
