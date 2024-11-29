package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        quickSort(arr,0, arr.length-1);
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int partionValue=partion(arr,low,high);
            quickSort(arr,low,partionValue-1);
            quickSort(arr,partionValue+1, high);
        }
    }

    public static int partion(int arr[], int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while (i<=high&&arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot&&j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}
