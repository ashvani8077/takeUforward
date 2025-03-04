package Recursion;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(4);
        st.push(2);
        st.push(6);
        st.push(3);
        st.push(5);
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }

    public static void sort(Stack<Integer>st){
        if(st.empty()){
            return;
        }
        int top=st.peek();
        st.pop();
        sort(st);
        helper(st,top);
    }

    public static void helper(Stack<Integer>st, int ele){
        if (st.isEmpty() || st.peek() <= ele) {
            st.push(ele);
            return;
        }

        int temp = st.pop();
        helper(st, ele);
        st.push(temp);
    }
}
