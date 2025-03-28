package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange994 {

    static class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
   }
//    public static void main(String[] args) {
//        int arr[][]={
//                {2,1,1,},
//                {1,1,0},
//                {0,1,1}
//        };
//
//    }

    public  static int answer(int arr[][]){
        int visited[][]=new int[arr.length][arr[0].length];
        Queue<Pair>q=new LinkedList<>();
        Queue<Integer>t=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==2){
                    q.add(new Pair(i,j));
                    t.add(0);
                    visited[i][j]=2;
                }
            }
        }
        int maxTime=bfs(arr,visited,q,t);
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited[0].length;j++){
                if (arr[i][j] == 1 && visited[i][j] != 2) {
                    return -1;
                }
            }
        }
        return maxTime;
    }


    public static int bfs(int arr[][], int visited[][], Queue<Pair>q, Queue<Integer>t){
        int maxTime=0;
        int directions[][]={
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };
        while (!q.isEmpty()){
            Pair re=q.poll();
            visited[re.i][re.j]=2;
            int currTime=t.poll();
            maxTime=Math.max(maxTime,currTime);

            for(int d[]:directions){
                int nRow=re.i+d[0];
                int nCol=re.j+d[1];
                if(nRow>=0 &&nRow<arr.length &&nCol>=0&&nCol<arr[0].length &&arr[nRow][nCol]==1 &&visited[nRow][nCol]!=2){
                    q.add(new Pair(nRow, nCol));
                    t.add(currTime+1);
                    visited[nRow][nCol]=2;
                }
            }
        }
        return maxTime;

    }
}
