package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingAndRepeatedValue {
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,3}};
    }
    public static int []solution(int arr[][]){
        int n=arr.length;
        int duplicate=Integer.MIN_VALUE;
        int miss=arr.length*arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                mp.put(arr[i][j], mp.getOrDefault(arr[i][j], 0) + 1);
            }
        }
        for (int num = 1; num <= n * n; num++) {
            int count = mp.getOrDefault(num, 0);
            if (count == 0) {
                miss = num;
            } else if (count == 2) {
                duplicate = num;
            }
        }
        int ans[]={duplicate,miss};
        return ans;

    }
}
