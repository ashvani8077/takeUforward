package HashMap_HashSet;

import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,1};
        System.out.println(mostFrequent(arr));

    }
    public static int mostFrequent(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int max=0;
        int lastFre=0;
        for(int key:mp.keySet()){
            if(mp.get(key)>lastFre){
                max=key;
                lastFre=mp.get(key);
            }
        }
        return max;
    }
}
