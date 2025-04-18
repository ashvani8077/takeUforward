package Dynamic_Programming;
import java.util.*;

public class FibonacciBottomUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        System.out.println(solution(dp,n));
    }
    public static int solution(int dp[], int n){
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
