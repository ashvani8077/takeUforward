package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves1020 {

    static class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }

    public static void main(String[] args) {
        int arr[][]={
                {0,0,0,0},
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,0}
        };
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1&&(i==0||j==0||i==arr.length-1||j==arr[0].length-1)){
                    q.add(new Pair(i,j));
                }
            }
        }
        bfs(arr, q);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1)count++;
            }
        }
        System.out.println(count);

    }

    public static void bfs(int arr[][],Queue<Pair>q){
        int directions[][]={
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };
        while (!q.isEmpty()){
            Pair re=q.poll();
            arr[re.i][re.j]=0;
            for(int i[]:directions){
                int nRow=re.i+i[0];
                int nCol=re.j+i[1];
                if(nRow>=0&&nRow<arr.length&&nCol>=0&&nCol<arr[0].length&&arr[nRow][nCol]==1){
                    q.add(new Pair(nRow, nCol));
                    arr[nRow][nCol]=0;
                }
            }
        }
    }
}
