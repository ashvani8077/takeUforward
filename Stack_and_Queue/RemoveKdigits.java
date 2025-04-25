package Stack_and_Queue;

import java.util.Stack;

public class RemoveKdigits {
    public static void main(String[] args) {
        String s="1432219";
        int k=3;
        System.out.println(solution(s,k));
    }
    public static String solution(String s, int k){
        if(k>=s.length()){
            return "0";
        }
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            while (!st.empty()&&k>0&&((st.peek()-'0')>(s.charAt(i)-'0'))){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while (k>0){
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.pop());
        }
        res.reverse();

        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}
