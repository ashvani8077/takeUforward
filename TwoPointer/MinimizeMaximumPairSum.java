package TwoPointer;
import java.util.*;

public class MinimizeMaximumPairSum {
    public static void main(String[] args) {
        int arr[]={3,5,4,2,4,6};
        System.out.println(solution(arr));
    }

    public static int solution(int arr[]){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while (i<j){
            int sum=sumPair(arr,i,j);
            ans=Math.max(ans,sum);
            i++;
            j--;
        }
        return ans;
    }

    public static int sumPair(int arr[], int i ,int j){
        return arr[i]+arr[j];
    }
}
