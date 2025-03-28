package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsAlgo {
    HashMap<Integer,HashMap<Integer,Integer>>map;
    public PrimsAlgo(int v){
        this.map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }


    public class PrimsPair{
        int vtx;
        int acqVtx;
        int cost;
        public PrimsPair(int vtx,int acqVtx,int cost){
            this.vtx=vtx;
            this.acqVtx=acqVtx;
            this.cost=cost;
        }
        @Override
        public String toString() {
            return "vtx: " + vtx + ", acqVtx: " + acqVtx + ", cost: " + cost;
        }
    }

    public int prims(){
        HashSet<Integer>visited=new HashSet<>();
        PriorityQueue<PrimsPair>pq=new PriorityQueue<>(
                (a,b)->a.cost-b.cost
        );
        pq.add(new PrimsPair(3,3,0));
        int sum=0;
        while (!pq.isEmpty()){
            PrimsPair rv=pq.poll();
            if(visited.contains(rv.vtx))continue;
            visited.add(rv.vtx);
            System.out.println(rv);
            sum+=rv.cost;
            for(int nbrs:map.get(rv.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost=map.get(rv.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs,rv.vtx,cost));
                }
            }
        }
        return sum;
    }
}
