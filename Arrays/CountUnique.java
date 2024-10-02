package Arrays;

import java.util.HashSet;

public class CountUnique {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        System.out.println(uniqueBrute(arr));
        System.out.println(countTwoPointerApproach(arr));
    }

    public static int uniqueBrute(int arr[]){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }


    public static int countTwoPointerApproach(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

}


//    Brute---->>>
//        Use set
//          Time Complexity=log n for insert values to set and n to iterate=n.logn
//          Space Complexity=n space =n



//    Optimal--->>
//        Time complexity=n only 1 pass