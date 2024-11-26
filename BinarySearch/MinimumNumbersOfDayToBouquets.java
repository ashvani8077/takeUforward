package BinarySearch;

public class MinimumNumbersOfDayToBouquets {
    public static void main(String[] args) {
        int arr[]={1,10,3,10,2};
        int m=3;
        int k=1;
        System.out.println(numberOfDays(arr,m,k));
    }
    public static int numberOfDays(int arr[], int m, int k){
        int len=arr.length;
        if(m*k>len){
            return -1;
        }
        int low=minimumOfArray(arr);
        int high=maximumOfArray(arr);
        int result=-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            boolean ans = canMake(arr, mid, k, m);
            if (ans) {
                result=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return result;
    }
    public static int minimumOfArray(int arr[]){
        int min=Integer.MAX_VALUE;
        for (int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static int maximumOfArray(int arr[]){
        int max=-1;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static boolean canMake(int arr[], int days, int k,int m){
        int make=0;
        int count=0;
        for (int i:arr){
            if(i<=days){
                count++;
            }
            else {
                make=make+count/k;
                count=0;
            }
        }
        make += count / k;
        if(make>=m){
            return true;
        }
        return false;
    }
}
