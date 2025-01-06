package Stack_and_Queue;
import java.util.*;
import java.util.ArrayList;

public class AsteroidCollision {
    public static void main(String[] args) {
        int arr[]={5,10,-5};
    }
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(arr[i])) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(arr[i])) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(arr[i]);
                }
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}












