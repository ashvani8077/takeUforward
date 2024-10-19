package Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(solution(arr));
    }

    public static int solution(int arr[]){
        int mini=arr[0];
        int profit=0;
        for (int i=1;i<arr.length;i++){
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return profit;
    }
}
