package BinarySearch;

public class RecursiveImplementation {
    public static void main(String[] args) {
        int arr[]={1,4,5,7,8,10,24,56,78};
        int k=56;
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        System.out.println(binarySearch(arr,low,high,k));
    }

    public static int binarySearch(int arr[],int i, int j, int k){
        if(i>j){
            return-1;
        }
        int mid=i+(j-i)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            return binarySearch(arr,i,mid-1,k);
        }
        else{
            return binarySearch(arr,mid+1,j,k);
        }
    }
}
