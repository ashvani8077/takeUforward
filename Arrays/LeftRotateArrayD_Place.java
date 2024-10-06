package Arrays;

public class LeftRotateArrayD_Place {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        rotateBrute(arr,d);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void rotateBrute(int arr[],int d){
        d=d% arr.length;
        int temp[]=new int[d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];

        }
        for (int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int c=0;
        for (int i= arr.length-d;i<arr.length;i++){
            arr[i]=temp[c];
            c++;
        }
    }
}

 
//    Brute----->>>
//          make an temporary array
//          Time Complexity=o(n-1),o(d)=o(n+d)
