package Arrays;

public class TrappingRainWater3 {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        System.out.println(answer(arr));
    }
    public static int answer(int arr[] ){
        int n=arr.length;
        int total=0;
        int leftMax=0;
        int rightMax=0;
        int l=0;
        int r=n-1;
        while (l<r){
            if(arr[l]<=arr[r]){
                if(leftMax>arr[l]){
                    total+=leftMax-arr[l];
                }
                else{
                    leftMax=arr[l];
                }
                l++;
            }
            else{
                if(rightMax>arr[r]){
                    total+=rightMax-arr[r];
                }
                else {
                    rightMax=arr[r];
                }
                r--;
            }
        }
        return total;
    }
}
