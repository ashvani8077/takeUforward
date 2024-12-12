package HashMap_HashSet;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class FindPlayerWithZeroOne {
    public static void main(String[] args) {
        int arr[][]={
                {1,3},
                {2,3},
                {3,6},
                {5,6},
                {5,7},
                {4,5},
                {4,8},
                {4,9},
                {10,4},
                {10,9}
        };
    }
    public static List<List<Integer>>solution(int arr[][]){
        ArrayList<Integer>li1=new ArrayList<>();
        ArrayList<Integer>li2=new ArrayList<>();
        HashMap<Integer, Integer>mp=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            mp.put(arr[i][1], mp.getOrDefault(arr[i][1], 0) + 1);
            mp.putIfAbsent(arr[i][0], 0);
        }
        for(var entry:mp.entrySet()){
            int player=entry.getKey();
            int losses=entry.getValue();
            if(losses==0){
                li1.add(player);
            }
            else if(losses==1){
                li2.add(player);
            }
        }
        Collections.sort(li1);
        Collections.sort(li2);
        List<List<Integer>>li=new ArrayList<>();
        li.add(li1);
        li.add(li2);
        return li;
    }

}
