package Dynamic_Programming;

public class HouseRobberRecursion {
    public static void main(String[] args) {
        int arr[]={5,1,3,7,1};
        System.out.println(Robber(arr,0));
    }
    public static int Robber(int arr[],int i){
        if(i>=arr.length){
            return 0;
        }
        int rob=arr[i]+Robber(arr,i+2);
        int dontRob=Robber(arr,i+1);
        return Math.max(rob,dontRob);
    }
}
