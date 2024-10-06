package Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }

        System.out.println("hello");
        rotateOptimal(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void rotateOptimal(int arr[]){
        int temp=arr[0];
        for (int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

}



//  OptimalSolution---->>
//        pick 1st value and put in the last and i-1=i
//        Time Complexity=n
