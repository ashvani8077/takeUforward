package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCell {

    static class Pair{
        int i;
        int j;
        int cost;

        public Pair(int i, int j, int cost){
            this.i=i;
            this.j=j;
            this.cost=cost;
        }
    }

    public static void main(String[] args) {
        int [][]arr={
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

    }

    public static int[][]answer(int arr[][]){
        int ans[][]=new int[arr.length][arr[0].length];
        for(int a[]:ans){
            Arrays.fill(a,-1);
        }
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    ans[i][j]=0;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        bfs(arr, ans, q);
        return ans;
    }

    public static void bfs(int arr[][], int ans[][], Queue<Pair>q){
        int directions[][]={
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };
        while (!q.isEmpty()){
            Pair rev=q.poll();
            for(int d[]:directions){
                int nRow=rev.i+d[0];
                int nCol=rev.j+d[1];
                if(nRow>=0&&nRow<arr.length&&nCol>=0&&nCol<arr[0].length&&ans[nRow][nCol]==-1){
                    q.add(new Pair(nRow, nCol, rev.cost+1));
                    ans[nRow][nCol]= rev.cost+1;
                }
            }
        }
    }
}
