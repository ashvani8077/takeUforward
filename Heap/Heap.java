package Heap;


class MaxHeap{
    int size;
    int total_size;
    int arr[];
    public MaxHeap(int n){
        arr=new int[n];
        size=0;
        total_size=n;
    }

    //Insert into the Heap
    public void insert(int value){
        if(size==total_size){
            System.out.println("Heap Overflow");
            return;
        }
        arr[size]=value;
        int index=size;
        size++;


        //Compare it with its parent
        while (index>0&&arr[(index-1)/2]<arr[index]){
            int temp=arr[(index-1)/2];
            arr[(index-1)/2]=arr[index];
            arr[index]=temp;
            index=(index-1)/2;
        }
        System.out.println(arr[index]+" is inserted into the heap.");
    }

    public void print(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void delete(){
        if(size==0){
            System.out.println("Heap Underflow no element available to delete");
            return;
        }
        System.out.println(arr[0]+" deleted from heap");
        arr[0]=arr[size-1];
        size--;
        if(size==0){
            return;
        }
        heapify(0);
    }

    public void heapify(int index){
        int largest=index;
        int left=2*index+1;
        int right=2*index+2;


        //Largest will store the index of the element which is greater
        //between the parent left child and right child.
        if(left<size&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<size&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            heapify(largest);
        }
    }
}

public class Heap {
    public static void main(String[] args) {
        MaxHeap m=new MaxHeap(10);
        m.insert(56);
        m.insert(23);
        m.insert(2);
        m.insert(35);
        m.insert(76);
        m.insert(65);
        m.insert(64);
        m.insert(19);
        m.insert(34);
        m.insert(43);
        m.print();
        m.insert(3333);
        m.delete();
        m.print();
    }
}
