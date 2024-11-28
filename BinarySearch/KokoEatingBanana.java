package BinarySearch;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 11};
        int h = 8;
    }

    public static int minimumHour(int arr[], int h) {
        int low = 1;
        int high = maxElement(arr);
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total=totalHour(arr,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int maxElement(int arr[]){
        int max=-1;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static int totalHour(int arr[], int mid){
        int total=0;
        for(int i:arr){
            total=total+(i+mid-1)/mid;
        }
        return total;
    }
}
