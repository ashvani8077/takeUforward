package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderTraversalinSpiralForm {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> answer(Node root){
        ArrayList<Integer>li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Stack<Node>s1=new Stack<>();        //L to R;
        Stack<Node>s2=new Stack<>();        //R to L;
        s2.push(root);
        while (!s1.empty()||!s2.empty()){

            //L to R
            if(!s2.empty()){
                while (!s2.empty()){
                    Node temp=s2.pop();
                    li.add(temp.data);
                    if(temp.left!=null){
                        s1.push(temp.left);
                    }
                    if(temp.right!=null){
                        s1.push(temp.right);
                    }
                }
            }

            //R to L
            if(!s1.empty()){
                while (!s1.empty()){
                    Node temp=s1.pop();
                    li.add(temp.data);
                    if(temp.right!=null){
                        s2.push(temp.right);
                    }
                    if(temp.left!=null){
                        s2.push(temp.left);
                    }
                }
            }
        }
        return li;
    }
}
