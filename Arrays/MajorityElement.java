package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};
        int n=arr.length;
        System.out.println(majorityBrute(arr,n));
        System.out.println(majorityBetter(arr,n));
        System.out.println(majorityOptimal(arr,n));
    }


    public static int majorityBrute(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                return arr[i];
            }
        }
        return -1;
    }

    public static int majorityBetter(int arr[],int n){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    public static int majorityOptimal(int arr[],int n){
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count=1;
            }
            else if(arr[i]==ele){
                count++;
            }
            else {
                count--;
            }
        }


        int count1=0;
        for (int i=0;i<n;i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(count1>n/2){
            return ele;
        }
        return -1;
    }
}


//    Brute---->>
//        Iterate compare and count
//        Time Complexity=n2


//    Better---->>
//        Use Hashmap
//        Time Complexity=
