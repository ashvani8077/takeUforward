package HashMap_HashSet;

import java.util.HashMap;
import java.util.*;

public class UniqueNumberOfOccurrence {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        boolean result=solution(arr);
        System.out.println(result);
        System.out.println(optimal(arr));
    }
    public static boolean solution(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> frequencySet = new HashSet<>();
        for (int fre:mp.values()){
            if (!frequencySet.add(fre)) {
                return false;
            }
        }
        return true;
    }
    public static boolean optimal(int arr[]){
        int ans[]=new int[2001];
        for (int num : arr) {
            ans[num + 1000]++;
        }
        Arrays.sort(ans);
        for (int i=0;i<ans.length;i++){
            if(ans[i]!=0&&ans[i]==ans[i-1]){
                return false;
            }
        }
        return true;
    }
}
