package BinarySearch;

public class CountFrequencyOfAnElement {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 2, 2, 3};
        System.out.println(ans(arr,2));
    }
    public static int ans(int arr[],int k){
        int a=firstIndex(arr,k);
        int b=lastIndex(arr,k);
        if(a==-1||b==-1){
            return 0;
        }
        return b - a + 1;
    }

    public static int firstIndex(int arr[], int k){
        int ans=-1;
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static int lastIndex(int arr[], int k){
        int ans=-1;
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}
