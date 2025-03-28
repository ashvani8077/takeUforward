package Stack_and_Queue;
import java.util.*;

public class StackImplementUsingQueue {
    static Queue<Integer>q= new LinkedList<>();
    public static void main(String[] args) {

    }
    public static void push(int x){
        int size=q.size();
        q.add(x);
        for (int i=1;i<=size;i++){
            q.add(q.peek());
            q.poll();
        }
    }
}
