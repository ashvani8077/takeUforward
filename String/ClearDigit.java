package String;

import java.util.Stack;

public class ClearDigit {
    public static void main(String[] args) {
        String s="cb3";
        System.out.println(clear(s));
    }
    public static String clear(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        while (!st.empty()){
            sb=sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}
