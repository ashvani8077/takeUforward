package Arrays;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        System.out.println(solutionOptimal(arr));
        System.out.println(solutionBrute(arr));
    }

    public static ArrayList solutionOptimal(int arr[]){
        ArrayList<Integer>li=new ArrayList<>();
        int max=arr[arr.length-1];
        li.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                li.add(arr[i]);
            }
        }
        Collections.reverse(li);
        return li;
    }


    public static ArrayList solutionBrute(int arr[]){
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                }
            }
            if(leader==true){
                li.add(arr[i]);
            }
        }
        return li;
    }
}





//Optimal--->>
//    Simply iterate from back and if find any element greater than max then add to list and max will be now that element
//    Time Complexity=O(n);
//
//
//Brute--->>
//    Iterate through 2 loop i and j if j>i then flag will false. if flag is true the add arr[i] to the list
//    Time Complexity=O(n^2);

