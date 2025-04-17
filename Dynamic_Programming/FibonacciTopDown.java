package Dynamic_Programming;
import java.util.*;

public class FibonacciTopDown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
    }
    public static int fib(int dp[], int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fib(dp, n-1)+fib(dp, n-2);
        return dp[n];
    }
}
