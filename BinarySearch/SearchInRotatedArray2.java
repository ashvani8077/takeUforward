package BinarySearch;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int arr[]={4,5,6,6,6,7,0,1,2};
        int k=6;
        System.out.println(searchRotated(arr,k));
    }

    public static boolean searchRotated(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k&&k<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=k&&k<=arr[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
