package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i+"  ");
        }
    }


    public static void mergeSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1, high);
        mergeArray(arr,low,mid,high);
    }

    public static void mergeArray(int arr[], int low, int mid, int high){
        ArrayList<Integer>li=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                li.add(arr[left]);
                left++;
            }
            else{
                li.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            li.add(arr[left]);
            left++;
        }
        while (right<=high){
            li.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=li.get(i-low);
        }
    }
}
