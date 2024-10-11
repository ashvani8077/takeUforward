package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int t=18;
        //int ans[]=twoSolutionBrute(arr,t);
        //int ans[]=twoBetter(arr,t);
        int ans[]=twoOptimal(arr,t);
        for (int i:ans){
            System.out.println(i);
        }
    }

    public static int [] twoSolutionBrute(int arr[],int k){
        int ans[]=new int[2];
        for (int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }


    public static int []twoBetter(int arr[],int k){
        int ans[] = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = k - a;
            if (hash.containsKey(more)) {
                ans[0] = hash.get(more);
                ans[1] = i;
            }
            hash.put(a, i);
        }
        return ans;
    }



    public static int [] twoOptimal(int arr[],int k){
        Arrays.sort(arr);
        int ans[]=new int[2];
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                ans[0]=i;
                ans[1]=j;
            }
            else if(sum<k){
                i++;
            }
            else {
                j++;
            }
        }
        return ans;
    }
}



//    Brute---->>
//        iterate and check arr[i]+arr[j]==k
//        Time Complexity=O(n2)



//    Better---->>>
//        USe hashmap
//        TIme Complexity=O(n.logn)



//    Optimal----->>
//        Use two pointer approach
//        Time Complexity=O(n)+O(n.logn)