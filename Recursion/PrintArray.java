package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int arr[]={3,7,6,2,8};
        print(arr,0);
    }
    public static void print(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]);
        print(arr,i+1);
    }
}
