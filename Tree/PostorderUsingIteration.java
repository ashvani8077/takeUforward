package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderUsingIteration {
    public static void main(String[] args) {

    }
    public static List<Integer> postorder(Node root){
        Stack<Node>st=new Stack<>();
        List<Integer>li=new ArrayList<>();
        st.push(root);
        while (!st.empty()){
            Node temp=st.pop();
            li.add(temp.data);
            if(temp.left!=null){
                st.push(temp.left);
            }
            if(temp.right!=null){
                st.push(temp.right);
            }
        }
        Collections.reverse(li);
        return li;
    }
}
