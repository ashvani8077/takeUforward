package Arrays;

import java.util.HashMap;
import java.util.*;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int arr[]={3,2,3,2,2,2};
    }
    public static boolean solution(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for (int value : mp.values()) {
            if (value % 2 != 0) return false;
        }
        return true;
    }
}
