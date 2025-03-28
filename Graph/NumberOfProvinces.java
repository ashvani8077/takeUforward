package Graph;

import java.util.*;

public class NumberOfProvinces {
    public static void main(String[] args) {

    }
    public static int find(int arr[][]){
        HashMap<Integer, ArrayList<Integer>>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        int ans=bft(map);
        return ans;
    }

    public static int bft(HashMap<Integer,ArrayList<Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        int count=0;
        for(int src:map.keySet()){
            if(visited.contains(src))continue;
            count++;
            q.add(src);
            while (!q.isEmpty()){
                int rv=q.poll();
                if(visited.contains(rv))continue;
                visited.add(rv);
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return count;
    }
}
