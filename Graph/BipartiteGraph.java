package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    class Solution{
        public static void main(String[] args) {

        }
        public  boolean isBipartite(int [][]graph){
            HashMap<Integer,Integer>visited=new HashMap<>();
            Queue<Pair>q=new LinkedList<>();
            for(int src=0;src<graph.length;src++){
                if(visited.containsKey(src))continue;
                q.add(new Pair(src,0));
                while (!q.isEmpty()){
                    Pair rv=q.poll();
                    if(visited.containsKey(rv.vtx)){
                        if(visited.get(rv.vtx)!=rv.distance){
                            return false;
                        }
                        else{
                            continue;
                        }
                    }
                    visited.put(rv.vtx,rv.distance);
                    for(int nbrs:graph[rv.vtx]){
                        if(!visited.containsKey(nbrs)) {
                            Pair temp = new Pair(nbrs, rv.distance + 1);
                            q.add(temp);
                        }
                    }
                }
            }
            return true;

        }
    }
    class Pair{
        int vtx;
        int distance;
        Pair(int vtx,int distance){
            this.vtx=vtx;
            this.distance=distance;
        }
    }
}
