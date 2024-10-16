package Arrays;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
       // sortBrute(arr);
        //sortBetter(arr);
        sortDutchNationalFlagAlgorithmOptimal(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void sortBrute(int arr[]){
        Arrays.sort(arr);
    }

    public static void sortBetter(int arr[]) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i : arr) {
            if (i == 0) {
                zero++;
            } else if (i == 1) {
                one++;
            } else {
                two++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (zero > 0) {
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            } else {
                arr[i] = 2;
                two--;
            }
        }
    }


    public static void sortDutchNationalFlagAlgorithmOptimal(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;

            }
            else if(arr[mid]==1){
                mid++;

            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}



//    Brute--->>>
//        Use Arrays.Sort function
//        Time Complexity=nLogn
//
//
//    Better--->>
//        Count the number of 0,1,2 and fill accordingly
//        Time Complexity=2n
//
//
//    Optimal---->
//        Dutch National Flag Algorithm
//        Time Complexity=N
