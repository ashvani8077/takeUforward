package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray2(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

//    public static void reverseArray(int arr[],int i, int j){
//        if(i>=j){
//            return;
//        }
//        swap(arr,i,j);
//        reverseArray(arr,i+1,j-1);
//    }
//    public static void swap(int arr[],int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }

    public static void reverseArray2(int arr[], int i, int n){
        if(i>=n/2){
            return;
        }
        swap(arr,i,n);
        reverseArray2(arr,i+1,n);
    }

    public static void swap(int arr[], int i, int n){
        int temp=arr[n-1-i];
        arr[n-1-i]=arr[i];
        arr[i]=temp;
    }
}
