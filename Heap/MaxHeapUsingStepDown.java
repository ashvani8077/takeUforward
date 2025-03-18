package Heap;

public class MaxHeapUsingStepDown {
    public static void main(String[] args) {
        int arr[]={10,3,8,9,5,13,18,14,11,70};
        BuildMaxHeap(arr,10);
        printHeap(arr,10);
    }

    public static void BuildMaxHeap(int arr[], int n){
        //Step Down
        for(int i=n/2-1;i>=0;i--){
            Heapify(arr,i,n);
        }
    }
    public static void Heapify(int arr[], int index, int n){
        int largest=index;
        int left=2*index+1;
        int right=2*index+2;
        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=index){
            int temp=arr[largest];
            arr[largest]=arr[index];
            arr[index]=temp;
            Heapify(arr,largest,n);
        }
    }
    public static void printHeap(int arr[], int n){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
