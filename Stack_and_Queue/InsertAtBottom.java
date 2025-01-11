package Stack_and_Queue;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        insert(st,1);
        System.out.println(st);
    }

    public static void insert(Stack<Integer>st, int ele){
        if(st.empty()){
            st.push(ele);
            return;
        }
        int top=st.peek();
        st.pop();
        insert(st,ele);
        st.push(top);
    }
}
