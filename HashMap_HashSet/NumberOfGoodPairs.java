package HashMap_HashSet;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        int result=0;
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                result=result+mp.get(arr[i]);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        return result;
    }
}
