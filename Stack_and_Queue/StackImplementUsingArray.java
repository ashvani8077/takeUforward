package Stack_and_Queue;

public class StackImplementUsingArray {
    static int stack[]=new int[10];
    static int top=-1;
    public static void main(String[] args) {
        push(4);
        System.out.println(top());
        push(6);
        System.out.println(size());
        System.out.println(pop());
        System.out.println(size());
    }
    public static void push(int x){
        if(top<=9){
            top+=1;
            stack[top]=x;
        }
    }

    public static int pop(){
        if(top==-1){
            return 0;
        }
        top=top-1;
        return stack[top+1];
    }

    public static int top(){
        return stack[top];
    }

    public static int size(){
        return top+1;
    }
}
