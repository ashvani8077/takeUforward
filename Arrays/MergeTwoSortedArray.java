package Arrays;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int m=arr1.length;
        int arr2[]={2,5,6};
        int n=arr2.length;
        MergeTwoSortedArray mm=new MergeTwoSortedArray();
        mm.merge(arr1,m,arr2,n);
    }
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int k=0;
        for(int i=m;i<m+n;i++){
            arr1[i]=arr2[k];
            k++;
        }
        Arrays.sort(arr1);
    }
}
