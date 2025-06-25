package Graph;

import java.util.*;

public class BfsAndDfs {
    public static void main(String[] args) {

    }
    public static boolean bfs(int src, int dest, HashMap<Integer,HashMap<Integer,Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()){
            int rv=q.poll();
            if(visited.contains(rv)) continue;
            visited.add(rv);
            if(rv==dest) return true;
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }


    public static boolean dfs(int src,int dest,HashMap<Integer,HashMap<Integer,Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        st.push(src);
        while (!st.isEmpty()){
            int rv=st.pop();
            if(visited.contains(rv)) continue;
            visited.add(rv);
            if(rv==dest) return true;
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
}
