package Stack_and_Queue;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        System.out.println(infixToPostfix(s));
    }

    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String ans = ""; // Using String instead of StringBuilder
        int i = 0;
        while (i < s.length()) {
            char str = s.charAt(i);
            if ((str >= 'A' && str <= 'Z') || (str >= 'a' && str <= 'z') || (str >= '0' && str <= '9')) {
                ans += str;
            } else if (str == '(') {
                st.push(str);
            } else if (str == ')') {
                while (!st.empty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (!st.empty()) {
                    st.pop();
                }
            } else {
                while (!st.empty() &&
                        priority(st.peek()) >= priority(str) &&
                        !(str == '^' && st.peek() == '^')) {
                    ans += st.pop();
                }
                st.push(str);
            }
            i++;
        }
        while (!st.empty()) {
            ans += st.pop();
        }
        return ans;
    }

    public static int priority(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 0;
        }
    }
}
