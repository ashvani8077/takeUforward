package Stack_and_Queue;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (!st.isEmpty()) {
                    sb.append(c);
                }
                st.push(c);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
