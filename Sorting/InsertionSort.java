package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        insertionSort(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int j=i;
            while (j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
