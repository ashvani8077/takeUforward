package Dynamic_Programming;
import java.util.*;

public class FibonacciOptimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(optimized(n));
    }
    public static int optimized(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}

