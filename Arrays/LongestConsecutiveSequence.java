package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(solutionBrute(arr));
        System.out.println(solutionBetter(arr));
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int solutionBrute(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int x = arr[i];
            while (linearSearch(arr, x + 1)) {
                x = x + 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }


    public static int solutionBetter(int arr[]){
        Arrays.sort(arr);
        int longest=1;
        int last=Integer.MIN_VALUE;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]-1==last){
                count++;
                last=arr[i];
            }
            else if(last!=arr[i]){
                count=1;
                last=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}



//Brute---->>
//    use loop and linear search
//    Time Complexity=O(n2)



//Better---->>
//    Sort array use count and longest for solving this problem
//    Time Complexity=O(n logn)