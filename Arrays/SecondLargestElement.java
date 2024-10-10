package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        System.out.println(SecondLargestBrute(arr));
        System.out.println(SecondLargestBetter(arr));
        System.out.println(SecondLargestOptimal(arr));
    }

    public static int SecondLargestBrute(int arr[]){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int secondLargest=Integer.MIN_VALUE;
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]!=max){
                secondLargest=arr[i];
                break;
            }
        }
        return secondLargest;
    }

    public static int SecondLargestBetter(int arr[]){
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLargest=-1;
        for(int i:arr){
            if(i>largest){
                largest=i;
            }
        }


        for(int i:arr){
            if(i>secondLargest&&i!=largest){
                secondLargest=i;
            }
        }

        return secondLargest;

    }

    public static int SecondLargestOptimal(int arr[]){
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]>secondLargest&&arr[i]<largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }
}



//  if i do array.sort and then try to print arr[n-2] then it will be
//  not working because if sorted 1,2,4,5,7,7 it print 7 in place of 5.



//    Brute--->>>
//        sort array pick last, iterate from n-2 and compare with last elemnt
//        Time Complexity= n for loop and logn for sort=n.logn


//    Better---->
//        iterate and find maximum, then again iterate and check the element is
//        greater then previous element and less than maximum.
//        Time Complexity=n for 1 loop and n for 2 logn for sorting so the complexity
//        will=n.logn.



//    Optimal----->>
//        find largest and second largest in a single loop.
//        Time Complexity=n for iterating in a loop

