package Sorting;

public class HeapSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        buildHeap(arr,arr.length);
        heapSort(arr,arr.length-1);
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void buildHeap(int arr[], int n){
        for (int i=n/2;i>0;i--){
            heapify(arr,n,i);
        }
    }

    public static void heapSort(int arr[], int n){
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr,i-1,0);
        }
    }

    public static void swap(int arr[], int zero, int i){
        int temp=arr[zero];
        arr[zero]=arr[i];
        arr[i]=temp;
    }

    public static void heapify(int arr[], int n, int i){
        int max=i;
        int leftChild=(2*i)+1;
        int rightChild=(2*i)+2;
        if(leftChild<=n&&arr[leftChild]>arr[max]){
            max=leftChild;
        }
        if(rightChild<n&&arr[rightChild]>arr[max]){
            max=rightChild;
        }
        if(max!=i){
            swap(arr, max, i);
            heapify(arr,n, max);
        }
    }
}
