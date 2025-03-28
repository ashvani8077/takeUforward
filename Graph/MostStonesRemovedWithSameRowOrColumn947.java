package Graph;

import java.util.*;

public class MostStonesRemovedWithSameRowOrColumn947 {
    public static void main(String[] args) {
        int arr[][]={
                {0,0},
                {0,1},
                {1,0},
                {1,2},
                {2,1},
                {2,2}
        };
    }
    public static int removeStones(int arr[][]){
        HashMap<Integer, ArrayList<Integer>>map=new HashMap<>();
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int row = arr[i][0];
            int col = ~arr[i][1];

            map.putIfAbsent(row, new ArrayList<>());
            map.putIfAbsent(col, new ArrayList<>());

            map.get(row).add(col);
            map.get(col).add(row);
        }
        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        int ans=0;
        for(int item:map.keySet()){
            if(visited.contains(item))continue;
            st.push(item);
            while (!st.isEmpty()){
                int rev=st.pop();
                if(visited.contains(rev))continue;
                visited.add(rev);
                    for(int i:map.get(rev)){
                        if(!visited.contains(i)) {
                            st.push(i);
                        }
                }
            }
            ans++;
        }
        return arr.length-ans;
    }
}
