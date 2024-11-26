package BinarySearch;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                ans=Math.min(ans,arr[low]);
                break;

            }
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
