package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;

    }

    public static long solve(int n, int from, int to, int aux){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        long count=solve(n-1, from, aux, to);
        count++;
        count=count+solve(n-1,aux, to, from);
        return count;
    }
}
