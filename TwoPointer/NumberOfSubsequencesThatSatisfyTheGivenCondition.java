package TwoPointer;
import java.util.*;

public class NumberOfSubsequencesThatSatisfyTheGivenCondition {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,6,7};
        int target=12;
        System.out.println(count(arr,target));
    }
    public static int count(int arr[],int target){
        Arrays.sort(arr);
        int mod = 1_000_000_007;
        int ans=0;
        int l=0;
        int pow[]=new int[arr.length];
        pow[0]=1;
        for(int i=1;i<arr.length;i++){
            pow[i] = (2 * pow[i-1])%mod;
        }
        int r=arr.length-1;
        while (l<=r){
            if(arr[l]+arr[r]<=target){
                ans = (ans + pow[r - l]) % mod;
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }

}
