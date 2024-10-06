package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        int unionBrute[]=unionBrute(arr1,arr2);
        for (int i:unionBrute){
            System.out.println(i);
        }
        System.out.println(unionOptimal(arr1,arr2));
    }

    public static int[] unionBrute(int arr1[],int arr2[]) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++){
            st.add(arr2[i]);
        }
        int union[]=new int[st.size()];
        int k=0;
        for (int it:st){
            union[k++]=it;
        }
        return union;
    }

    public static ArrayList unionOptimal(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer>union=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n1&&j<n2){
            if(arr1[i]<=arr2[i]){
                if(!union.contains(arr1[i])){
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(!union.contains(arr2[j])){
                    union.add(arr1[j]);
                }
                j++;
            }
        }
        while (j<n2){
            if(!union.contains(arr2[j])){
                union.add(arr2[j]);
            }
            j++;
        }

        while (i<n1){
            if(!union.contains(arr1[i])){
                union.add(arr1[i]);
            }
            i++;
        }
        return union;
    }
}





//    Brute---->>
//       using set
//       Time Complexity=n1logn, n2logn, n1+n2=O(n1logn+n2logn)+O(n1+n2)



//    Optimal----->>
//        two pointer
//        Time Complexity=O(n1+n2)

