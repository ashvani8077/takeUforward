package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
