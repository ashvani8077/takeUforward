//package Stack_and_Queue;
//
//import java.util.Stack;
//
//public class PostfixToInfix {
//    public static void main(String[] args) {
//        String s="AB-DE+F*/";
//    }
//    public static String postfixToInfix(String s){
//        int i=0;
//        Stack<String>st=new Stack<>();
//        int len=s.length();
//        while (i<len){
//            char str=s.charAt(i);
//            if((str>='A'&&str<='Z')||(str>='a'&&str<='z')||(str>='0'&&str<='9')){
//                st.push(String.valueOf(str));
//            }
//            else{
//                char t1=st.peek();
//                st.pop();
//                char t2=st.peek();
//                st.pop();
//                String temp="("+t1+str+t2+")";
//                st.push(temp);
//            }
//            i++;
//        }
//        return st.peek();
//    }
//}
