package Stack_and_Queue;

public class QueueImplementUsingArray {
    static int n=10;
    static  int queue[]=new int[10];
    static int currSize=0;
    static int start=-1;
    static int end=-1;
    public static void main(String[] args) {
        push(5);
        push(4);
        System.out.println(size());
        push(3);
        System.out.println(pop());
        System.out.println(top());
    }

    public static void push(int x){
        if(currSize==n){
            return;
        }

        if(currSize==0){
            start=0;
            end=0;

        }
        else {
            end=(end+1)%n;
        }
        queue[end]=x;
        currSize+=1;
    }

    public static int pop(){
        if(currSize==0){
            return -1;
        }
        int el=queue[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else {
            start=(start+1)%n;
        }
        currSize-=1;
        return el;
    }

    public static int top(){
        if(currSize==0){
            return -1;
        }
        return queue[start];
    }

    public static int size(){

        return currSize;
    }
}
