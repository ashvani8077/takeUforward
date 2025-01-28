package Recursion;

import java.util.ArrayList;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        ArrayList<Integer>li=new ArrayList<>();
        print(0,li,arr,arr.length);
    }

    public static void print(int i,ArrayList<Integer> li,int arr[], int n){
        if(i>=n){
            System.out.println(li);
            return;
        }

        li.add(arr[i]);
        print(i+1,li,arr,n);
        li.remove(li.size()-1);
        print(i+1,li,arr,n);
    }
}
