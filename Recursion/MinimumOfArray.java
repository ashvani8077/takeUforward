package Recursion;

public class MinimumOfArray {
    public static void main(String[] args) {
        int arr[]={3,7,6,2,8};
        System.out.println(min(arr,0));
    }
    public static int min(int arr[], int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return Math.min(arr[i],min(arr,i+1));
    }
}
