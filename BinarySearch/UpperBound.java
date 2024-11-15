package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr[]={3,5,8,15,19,19,19};
        int k=7;
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
