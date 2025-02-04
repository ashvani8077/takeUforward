package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderUsingIteration {
    public static void main(String[] args) {

    }
    public static List<Integer> preorder(Node root){
        Stack<Node>st=new Stack<>();
        List<Integer>li=new ArrayList<>();
        st.push(root);
        while (!st.empty()){
            Node temp=st.pop();
            li.add(temp.data);
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
        }
        return li;
    }
}
