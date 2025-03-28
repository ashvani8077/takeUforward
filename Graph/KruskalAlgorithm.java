package Graph;

import java.util.*;

public class KruskalAlgorithm {
    private HashMap<Integer,HashMap<Integer,Integer>>map;
    public KruskalAlgorithm(int v){
        this.map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public  void addEdge(int v1,int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
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

    public ArrayList<EdgePair> allEdge(){
        ArrayList<EdgePair>ll=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2: map.get(e1).keySet()){
                int cost=map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }

    public void Kruskal(){
        List<EdgePair>ll=allEdge();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost-o2.cost;
            }
        });

        int ans=0;
        DisJointSet ds=new DisJointSet();
        for(int v:map.keySet()){
            ds.createSet(v);
        }
        for(EdgePair e:ll){
            int e1=e.e1;
            int e2=e.e2;
            int cost=e.cost;
            int re1= ds.findParent(e1);
            int re2=ds.findParent(e2);
            if(re1==re2){
                continue;
            }
            else{
                ds.union(e1,e2);
                System.out.println(e);
                ans+=e.cost;
            }
        }
        System.out.println(ans);    //Here ans is the cost of minimum spanning tree
    }
}
