package Arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        System.out.println(LargestBrute(arr));
        System.out.println(LargestOptimal(arr));
    }
    public static int LargestBrute (int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int LargestOptimal(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}

//      Brute----->>
//            Sort and Print Last element
//            Time Complexity=n.logn
//
//
//      Optimal_____>>
//            initialize max iterate with each element
//            Time Complexity=n


