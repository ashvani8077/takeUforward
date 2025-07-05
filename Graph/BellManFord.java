package Graph;

import java.util.*;
import java.util.HashMap;

public class BellManFord {
    HashMap<Integer,HashMap>map;
    public BellManFord(int v){
        this.map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i, new HashMap<>());
        }
    }

    //Directed GRAPH
    public void addEdge(int v1, int v2,int cost){
        map.get(v1).put(v2,cost);
    }
    public  class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
    }

    public ArrayList<KruskalAlgorithm.EdgePair> allEdge(){
        ArrayList<Graph.KruskalAlgorithm.EdgePair>ll=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2: map.get(e1).keySet()){
                int cost=map.get(e1).get(e2);
                ll.add(new Graph.KruskalAlgorithm.EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }
}
