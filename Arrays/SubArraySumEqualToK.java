package Arrays;

import java.util.HashMap;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        System.out.println(brute(arr,k));
        System.out.println(better(arr,k));
    }

    public static int brute(int arr[], int s){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum==s){
                    count++;
                }
            }
        }
        return count;
    }


    public static int better(int arr[] , int k){
        int count=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }


//    public static int OptimalUsingPrefixSum(int arr[],int k){
//        int n = arr.length;
//        HashMap mpp = new HashMap();
//        int preSum = 0, cnt = 0;
//        mpp.put(0,1);
//        for (int i=0;i<arr.length;i++){
//            preSum=preSum+arr[i];
//            int remove=preSum-k;
//            cnt += mpp.getOrDefault(remove, 0);
//            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
//        }
//        return cnt;
//    }
}



//Brute---->>>
//    Find Subarray add them and check if equal to k than count++:
//    TIme COmplexity=O(n3);


//Better--->>
//    Just brute approach only remove the k loop no need for that
//    Time Complexity=O(n2);


//Optimal-->>
//    Prefix Sum
//    Time Complexity=O(n)
