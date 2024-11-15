package BinarySearch;
import java.util.*;
public class FloorAndCeil {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        // code here
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                ans[0]=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans[1]=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}
