package TwoPointer;

import java.util.HashMap;

public class CountTheNumberOfGoodPair {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(numberOfGoodPair(arr));
    }

    public static int numberOfGoodPair(int arr[]){
        int mod = (int) 1e9 + 7;
        HashMap<Integer, Integer> lastIndex = new HashMap<>();
        int result = 1;
        int j = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i > j) {
                result = (result * 2) % mod;
            }
            j = Math.max(j, lastIndex.getOrDefault(arr[i], -1));
            lastIndex.put(arr[i], i);
        }

        return result;
    }
}
