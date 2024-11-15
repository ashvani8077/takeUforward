package BinarySearch;

public class IterativeImplementation {
    public static void main(String[] args) {
        int arr[]={1,4,5,7,8,10,24,56,78};
        int k=56;
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                break;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        System.out.println(ans);
    }
}
