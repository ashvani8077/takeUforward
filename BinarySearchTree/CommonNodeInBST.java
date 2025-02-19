package BinarySearchTree;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonNodeInBST {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> common(Node root1, Node root2){
        ArrayList<Integer>li=new ArrayList<>();
        recursion(root1,li);
        HashSet<Integer>hs=new HashSet<>();
        recursion2(root2, hs,li);
        ArrayList<Integer>ans=new ArrayList<>(hs);
        return ans;
    }
    public static void recursion(Node root, ArrayList<Integer>li){
        if(root==null){
            return;
        }
        recursion(root.left, li);
        li.add(root.data);
        recursion(root.right,li);
    }

    public static void recursion2(Node root, HashSet<Integer>hs,ArrayList<Integer>li){
        if(root==null){
            return;
        }
        recursion2(root.left,hs,li);
        if(li.contains(root.data)){
            hs.add(root.data);
        }
        recursion2(root.right,hs,li);
    }
}
