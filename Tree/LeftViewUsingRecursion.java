package Tree;

import java.util.*;
public class LeftViewUsingRecursion {
    public static void main(String[] args) {

    }
    public static void leftView(Node root,int level, List<Integer>li){
        if(root==null){
            return;
        }
        if(level==li.size()){
            li.add(root.data);
        }
        leftView(root.left,level+1,li);
        leftView(root.right,level+1,li);
    }
}
