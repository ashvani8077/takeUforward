package Stack_and_Queue;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String s="()[{}()]";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s){
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('||t=='{'||t=='['){
                st.push(t);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char t2=st.peek();
                st.pop();
                if((t==')'&&t2=='(')||(t=='}'&&t2=='{')||t==']'&&t2=='['){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}
