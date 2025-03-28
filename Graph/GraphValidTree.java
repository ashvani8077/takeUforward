package Graph;

import java.util.*;

public class GraphValidTree {
    public static void main(String[] args) {

    }
    public static boolean isTree(int n,int edges[][]){
        HashMap<Integer, ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return bft(map);
    }


    public static boolean bft(HashMap<Integer,ArrayList<Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        int count=0;
        for(int src:map.keySet()){
            if(visited.contains(src))continue;
            count++;
            q.add(src);
            while (!q.isEmpty()){
                int rv=q.poll();
                if(visited.contains(rv))return false;
                visited.add(rv);
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return count==1;
    }
}
