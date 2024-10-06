package Arrays;

import java.util.ArrayList;

public class MoveAllZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        //moveBrute(arr);
        for (int i:arr){
            System.out.println(i);
        }
        System.out.println("hello");
        moveOptimal(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void moveBrute(int arr[]){
        ArrayList<Integer>temp=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int ans[]=new int[arr.length];
        for (int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for (int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void moveOptimal(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i=j+1;j<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}




//    Brute------>>>
//       store non-zero numers in temp and add 0's in the end.
//       Time Complexity=o(n),o(x),o(n-x)=o(2n)


//    Optimal---->>
//        two pointer
//        Time Complexity=O(x),O(n-x)=O(n)