package Arrays;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int arr[]={32,1,3,54,21,53,22,64};
        int ans[]=getSecondOrderElements(arr);
        for (int i:ans){
            System.out.println(i);
        }
    }
    public static int[] getSecondOrderElements(int []arr) {
        // Write your code here.
        int n=arr.length;
        int ans[]=new int[2];
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i]!=largest){
                secondLargest=arr[i];
            }


            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest&&arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        ans[0]=secondLargest;
        ans[1]=secondSmallest;
        return ans;
    }
}
