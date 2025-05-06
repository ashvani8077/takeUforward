package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobberTopDown {
    public static void main(String[] args) {
        int arr[]={5,1,3,7,1};
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(Robber(arr,0,dp));
    }
    public static int Robber(int arr[], int i, int dp[]){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int Rob=arr[i]+Robber(arr,i+2,dp);
        int DontRob=Robber(arr, i+1, dp);
        dp[i]=Math.max(Rob,DontRob);
        return dp[i];
    }
}
