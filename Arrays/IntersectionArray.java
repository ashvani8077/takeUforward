package Arrays;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,5,6,6,7};
        System.out.println(intersectionBrute(arr1,arr2));
        System.out.println("Second Method");
        System.out.println(intersectionOptimal(arr1,arr2));

    }

    public static ArrayList intersectionBrute(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int visited[]=new int[n2];
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]&&visited[j]==0){
                    ans.add(arr1[i]);
                    visited[j]=1;
                }
            }
        }
        return ans;
    }


    public static ArrayList intersectionOptimal(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while (i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
           else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}



//    Brute---->>
//        Use another visited array
//        Time Complexity=O(n1*n2)



//    Optimal----->>
//        Use Two Pointer approach
//        Time Complexity=O(n1+n2)