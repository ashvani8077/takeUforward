package Arrays;

import java.util.Arrays;

public class AppearsOnceNumber {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        System.out.println(onceBrute(arr));
        System.out.println(onceBetter(arr));
        System.out.println(onceOptimal(arr));

    }

    public static int onceBrute(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    counter++;
                }
            }
            if (counter == 1) {
                return num;
            }
        }
        return -1;
    }



    public static int onceBetter(int arr[]){
        Arrays.sort(arr);
        int hash[]=new int[arr[arr.length-1]];
        for (int i=0;i<hash.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }


    public static int onceOptimal(int arr[]){
        int xor=0;
        for (int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}




//    Brute--->>
//        Iterate Linear loop
//        Time Complexity=O(n2)



//    Better--->>
//        Use Hash
//        Time COmplexity=O(2n)



//    Optimal
//        use XOR operator
//        Time Complexity=