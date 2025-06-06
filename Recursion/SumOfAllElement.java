package Recursion;

public class SumOfAllElement {
    public static void main(String[] args) {
        int arr[]={3,4,5,2,8};
        System.out.println(sum(arr,0));
    }
    public static int sum(int arr[], int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i]+sum(arr,i+1);
    }
}
