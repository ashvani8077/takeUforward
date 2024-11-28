package BinarySearch;

import java.util.Arrays;

public class AggressiveCow {
    public static void main(String[] args) {
        int arr[]={0,3,4,7,10,9};
        int cow=4;
        System.out.println(solution(arr,cow));
        System.out.println(binarySearch(arr,cow));
    }
    public static int solution(int arr[], int cow){
        Arrays.sort(arr);
        int limit = arr[arr.length - 1] - arr[0];
        for (int i = 1; i <= limit; i++) {
            if (canPlace(arr, i, cow) == false) {
                return (i - 1);
            }
        }
        return limit;
    }

    public static boolean canPlace(int arr[], int dist, int cow){
        int countCow=1;
        int last=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                countCow++;
                last=arr[i];
            }
        }
        if(countCow>=cow){
            return true;
        }
        else {
            return false;
        }
    }

    public static int binarySearch(int arr[],int cow){
        Arrays.sort(arr);
        int ans=-1;
        int low=0;
        int high=arr[arr.length-1]-arr[0];
        while (low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(arr,mid,cow)==true){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
}
