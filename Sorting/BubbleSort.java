package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        boolean didSwapHappen=false;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwapHappen=true;
                }
            }
            if(didSwapHappen==false){
                break;
            }
        }
    }
}
