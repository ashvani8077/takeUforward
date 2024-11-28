package BinarySearch;

public class CountRotationOfArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
        System.out.println(rotationCount(arr));
    }

    public static int rotationCount(int arr[]){
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(ans>arr[low]){
                    ans=arr[low];
                    idx=low;
                    break;
                }
            }
            if(arr[low]<=arr[mid]){
                if(ans>arr[low]){
                    ans=arr[low];
                    idx=low;
                }
                low=mid+1;
            }
            else{
                if(ans>arr[mid]){
                    ans=arr[mid];
                    idx=mid;
                }
                high=mid-1;
            }
        }
        return idx;
    }
}
