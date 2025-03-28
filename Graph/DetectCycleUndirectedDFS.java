package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DetectCycleUndirectedDFS {
    class Pair{
        int node;
        int parent;
        public Pair(int node, int parent){
            this.node=node;
            this.parent=parent;
        }
    }
    public  boolean isCycle(HashMap<Integer,HashMap<Integer,Integer>>map, int src){
        HashSet<Integer>visited=new HashSet<>();
        Stack<Pair>st=new Stack<>();
        st.push(new Pair(src,-1));
        while (!st.isEmpty()){
            Pair re=st.pop();
            if(visited.contains(re.node))continue;
            visited.add(re.node);
            for(int nbrs:map.get(re.node).keySet()){
                if(!visited.contains(nbrs)){
                    Pair np=new Pair(nbrs, re.node);
                    st.push(np);
                }
                else if(nbrs!=re.parent){
                    return true;
                }
            }
        }
        return false;
    }
}
