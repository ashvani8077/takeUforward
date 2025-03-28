package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


class DijkstraPair{
    int vtx;
    String acq;
    int cost;
    DijkstraPair(int vtx, String acq, int cost){
        this.vtx=vtx;
        this.acq=acq;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return vtx + " " + acq + "@" + cost;
    }
}
public class DijkstraAlgorithm {
    public static void main(String[] args) {

        Graph g = new Graph(7);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 4, 2);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 5, 6);
        g.addEdge(5, 6, 11);
        g.addEdge(5, 7, 1);
        g.addEdge(6, 7, 3);
        dijkstra(1,g.map);
    }

    public static void dijkstra(int src,HashMap<Integer,HashMap<Integer,Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new DijkstraPair(src,""+src,0));
        while (!pq.isEmpty()){
            DijkstraPair rp= pq.poll();
            if(visited.contains(rp.vtx))continue;
            visited.add(rp.vtx);
            System.out.println(rp);
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int edgeCost = map.get(rp.vtx).get(nbrs);
                    DijkstraPair np = new DijkstraPair(nbrs, rp.acq + nbrs, rp.cost + edgeCost);
                    pq.add(np);
;                }
            }
        }
    }
}
