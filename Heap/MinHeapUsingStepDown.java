package Heap;

public class MinHeapUsingStepDown {
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
        int smallest=index;
        int left=2*index+1;
        int right=2*index+2;
        if(left<n&&arr[left]<arr[smallest]){
            smallest=left;
        }
        if(right<n&&arr[right]<arr[smallest]){
            smallest=right;
        }
        if(smallest!=index){
            int temp=arr[smallest];
            arr[smallest]=arr[index];
            arr[index]=temp;
            Heapify(arr,smallest,n);
        }
    }
    public static void printHeap(int arr[], int n){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
