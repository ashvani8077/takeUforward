package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateInAnArray {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>li=new ArrayList<>();
        for(var c:mp.entrySet()){
            int k=c.getKey();
            int v=c.getValue();
            if(v>1){
                li.add(k);
            }
        }
        System.out.println(li);
    }
}
