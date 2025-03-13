package Recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse2(st);
        System.out.println(st);

    }

//    public static void reverse(Stack<Integer>st){
//        if(st.empty()){
//            return;
//        }
//        int top=st.peek();
//        st.pop();
//        reverse(st);
//        Stack<Integer>temp=new Stack<>();
//        while (!st.empty()){
//            temp.push(st.peek());
//            st.pop();
//        }
//        st.push(top);
//        while (!temp.empty()){
//            st.push(temp.peek());
//            temp.pop();
//        }
//
//    }

    public static void reverse2(Stack<Integer>st){
        if(st.empty()){
            return;
        }
        int top=st.peek();
        st.pop();
        reverse2(st);
        insert(st,top);
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
