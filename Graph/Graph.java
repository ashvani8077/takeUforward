package Graph;
import java.util.*;
import java.util.HashMap;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
    public Graph(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noOfEdges(){
        int sum=0;
        for (int key: map.keySet()){
            sum+=map.get(key).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1,int v2){
        if(map.containsKey(v1)&&map.containsKey(v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v){
        for(int neighbours:map.get(v).keySet()){
            map.get(neighbours).remove(v);
        }
        map.remove(v);
    }

    public void display(){
        for(int key: map.keySet()){
            for(int nbrs: map.get(key).keySet()){
                int cost=map.get(key).get(nbrs);
                System.out.println("Source: "+key+" Destination: "+nbrs+" Cost: "+cost);
            }
        }
    }


    public boolean hasPath(int src, int dis, Set<Integer>visited){
        if(src==dis){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans=hasPath(nbrs,dis,visited);
                if(ans){
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }

    public void printAllPath(int src, int dist, HashSet<Integer>visited, String s){
        if(src==dist){
            s=s+src;
            System.out.println(s);
            return;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                printAllPath(nbrs, dist,visited, s+src);
            }
        }
        visited.remove(src);
    }
    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(7,5,2);
        g.addEdge(6,7,3);
        g.display();
        System.out.println();
        System.out.println(g.containsEdge(3,4));
        System.out.println();
        System.out.println(g.containsVertex(9));
        System.out.println(g.noOfEdges());
        System.out.println("..............");
        System.out.println(g.hasPath(1,6,new HashSet<>()));
        System.out.println("______________");
        g.printAllPath(1,6,new HashSet<>(),"");
        System.out.println("_______________________");
        System.out.println(BfsAndDfs.bfs(1,6,g.map));
        System.out.println("__________________________");
        System.out.println(BfsAndDfs.dfs(1,6,g.map));
        System.out.println("_________BFT____________");
        BftAndDft.bft(g.map);
        System.out.println("________DFT______________");
        BftAndDft.dft(g.map);

    }
}
