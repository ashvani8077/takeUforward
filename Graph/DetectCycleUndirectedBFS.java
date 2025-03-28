package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleUndirectedBFS {
    class Pair{
        int node;
        int parent;
        public Pair(int node, int parent){
            this.node=node;
            this.parent=parent;
        }

    }

    public boolean isCycle(HashMap<Integer,HashMap<Integer,Integer>>map, int src){
        HashSet<Integer>visited=new HashSet<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(src, -1));
        while (!q.isEmpty()){
            Pair re=q.poll();
            if(visited.contains(re.node))continue;
            visited.add(re.node);
            for (int nbrs:map.get(re.node).keySet()){
                if(!visited.contains(nbrs)){
                    Pair np=new Pair(nbrs, re.node);
                    q.add(np);
                }
                else if(nbrs!=re.parent){
                    return true;
                }
            }
        }
        return false;
    }
}
