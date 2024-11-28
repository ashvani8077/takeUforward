package BinarySearch;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int arr[]={3,5,8,15,19,19,19};
        int ans[]=new int[2];
        ans[0]=firstIndex(arr,19);
        ans[1]=lastIndex(arr,19);
        for (int i:ans){
            System.out.println(i);
        }
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

