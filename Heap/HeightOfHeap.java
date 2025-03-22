package Heap;

public class HeightOfHeap {
    public static void main(String[] args) {
        int arr[]={3, 6, 9, 2, 15, 10, 14, 5, 12};
        int n=arr.length;
        int ans=solution(arr,n);
        System.out.println(ans);
    }
    public static int solution(int arr[],int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int count=0;
        while (n>1){
            n=n/2;
            count++;
        }
        return count;
    }
}
