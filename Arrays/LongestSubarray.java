package Arrays;

import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(subarrayBrute1(arr,k));
        System.out.println(subarrayBrute2(arr,k));
        System.out.println(subarraybetter(arr,k));
        System.out.println(subarrayOptimal(arr,k));
    }


    public static int subarrayBrute1(int arr[],int key){
        int length=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum==key){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }


    public static int subarrayBrute2(int arr[],int key){
        int length=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==key){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }



    public static int subarraybetter(int arr[],int key){
        int n = arr.length; // size of the array.
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == key) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - key;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }



    public static int subarrayOptimal(int arr[],int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int maxLen=0;
        while (right<arr.length){
            while (left<=right&&sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<arr.length){
                sum=sum+arr[right];
            }
        }
        return maxLen;
    }
}




//    Brute1---->>>
//        Use 2 for loop   for generate subarray 3rd loop for finding sum, check and update the length of array
//        Time Complexity=O(n3)


//    Brute2---->>
//        optimize the 3rd k loop
//        Time Complexity=O(n2)


//    Better----->>
//        Use Hashmap
//        Time Complexity=O(n)



//    Optimal---->>>
//        Two Pointer approach
//        Time Complexity=O(2n)