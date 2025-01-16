package Stack_and_Queue;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp!=']'){
                st.push(temp);
            }
            else{
                StringBuilder sb=new StringBuilder();
                while (!st.isEmpty()&&st.peek()!='['){
                    sb.insert(0,String.valueOf(st.peek()));
                    st.pop();
                }
                st.pop();

                StringBuilder numBuilder = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    numBuilder.insert(0, st.pop());
                }

                int num=Integer.parseInt(numBuilder.toString());
                ans=ans+getAns(sb.toString(),num);
            }

        }
        System.out.println(ans);
    }

    public static String getAns(String sb, int num){
        String temp="";
        for(int i=1;i<=num;i++){
            temp=temp+sb;
        }
        return temp;
    }
}
