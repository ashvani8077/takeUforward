package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int k=5;
        System.out.println(searchInsert(arr,k));
    }

    public static int searchInsert(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
