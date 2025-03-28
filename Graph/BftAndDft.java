package Graph;

import java.util.*;

public class BftAndDft {
    public static void main(String[] args) {

    }
    public  static void bft(HashMap<Integer,HashMap<Integer,Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }
            q.add(src);
            while (!q.isEmpty()){
                int rv=q.poll();
                if(visited.contains(rv))continue;
                visited.add(rv);
                System.out.print(rv+" ");
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
            System.out.println();
        }
    }

    public  static void dft(HashMap<Integer,HashMap<Integer,Integer>>map){
        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        for(int src:map.keySet()){
            if(visited.contains(src))continue;
            st.push(src);
            while (!st.isEmpty()){
                int rv=st.pop();
                if(visited.contains(rv)) continue;
                visited.add(rv);
                System.out.print(rv+" ");
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        st.push(nbrs);
                    }
                }
            }
            System.out.println();
        }
    }
}
