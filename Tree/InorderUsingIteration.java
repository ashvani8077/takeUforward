package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderUsingIteration {
    public static void main(String[] args) {

    }
    public static List<Integer> inorder(Node root){
        List<Integer>li=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        Stack<Boolean>visited=new Stack<>();
        st.push(root);
        visited.push(false);
        while (!st.empty()){
            Node temp=st.pop();
            boolean flag=visited.pop();
            if(!flag){
                if(temp.right!=null){
                    st.push(temp.right);
                    visited.push(false);
                }
                st.push(temp);
                if(temp.left!=null){
                    st.push(temp.left);
                    visited.push(false);
                }
            }
            else{
                li.add(temp.data);
            }
        }
        return li;
    }
}
