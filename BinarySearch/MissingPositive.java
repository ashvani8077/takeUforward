package BinarySearch;

public class MissingPositive {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k=5;
        System.out.println(missing(arr,k));
    }

    public static int missing(int arr[], int k){
        int l=0;
        int r=arr.length-1;
        int mid=-1;
        while (l<=r){
            mid=(l+r)/2;
            int kitne_bache=arr[mid]-(mid+1);
            if(kitne_bache<k){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return l+k;
    }
}
