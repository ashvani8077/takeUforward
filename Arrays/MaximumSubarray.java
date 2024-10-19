package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumOptimal(arr));
        System.out.println(maximumBrute(arr));
        System.out.println(maximumBetter(arr));
    }



    public static int maximumBrute(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }


    public static int maximumBetter(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static int maximumOptimal(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum=arr[i];
            }
            else{
                sum=sum+arr[i];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}





//
//    Brute   ---->>
//        find subarray sum all the subarray, check max and update
//        Time Complexity=O(n3)
//
//    Better---->>
//        Just only remove the k third loop
//        Time Complexity=O(n2)
//    Optimal ---->>
//        iterate check sum is <0 then sum =0 and update max accordingly
//        Time Complexity=O(n)
//