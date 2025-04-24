package Dynamic_Programming;

public class HouseRobberBottomUp {
    public static void main(String[] args) {
        int arr[]={5,1,3,7,1};
        System.out.println(Robber(arr));

    }
    public static int Robber(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<dp.length;i++){

            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
