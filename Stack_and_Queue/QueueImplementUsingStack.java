package Stack_and_Queue;

import java.util.Stack;

public class QueueImplementUsingStack {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();
    public static void main(String[] args) {

    }

    public static void push(int x){
        int s=s1.size();
        while (s>0){
            s2.push(s1.peek());
            s1.pop();
            s--;
        }
        s1.push(x);
        int size=s2.size();
        while (size>0){
            s1.push(s2.peek());
            s2.pop();
        }
    }
}
