package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        System.out.println(index(arr,9));
    }
    public static int index(int arr[], int k){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            }
            else if(arr[mid]==k){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
