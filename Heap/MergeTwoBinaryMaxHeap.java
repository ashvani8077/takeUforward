package Heap;

public class MergeTwoBinaryMaxHeap {
    public static void main(String[] args) {
        int arr1[]={10, 5, 6, 2};
        int arr2[]={12,7,9};
    }
    public static int []maxHeap(int arr1[],int arr2[]){
        int arr[]=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            arr[k++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[k++]=arr2[i];
        }
        int t=arr.length;
        for(int i=t/2-1;i>=0;i--){
            Heapify(arr,i,t);
        }
        return arr;
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
}
