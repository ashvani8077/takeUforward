package Arrays;

public class RightRotateLeetCode {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        rotate(arr,d);
        for (int i:arr){
            System.out.println(i);
        }

    }
    public static void rotate(int arr[],int d){
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[n-d+i];
        }
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
    }
}
