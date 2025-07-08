package Graph;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions130 {

    static class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }


    public static void main(String[] args) {
        char arr[][]={
                {'x','x','x','x'},
                {'x','o','o','x'},
                {'x','x','o','x'},
                {'x','o','x','x'},
        };
        Queue<Pair>q=new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='O'&&(i==0||j==0||i==arr.length-1||j==arr[0].length-1)){
                    q.add(new Pair(i,j));
                }
            }
        }
        bfs(arr,q);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='O'){
                    arr[i][j]='X';
                }
                else if(arr[i][j]=='T'){
                    arr[i][j]='O';
                }
            }
        }
    }

    public static void bfs(char[][]arr, Queue<Pair>q){
        int directions[][]={
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };
        while (!q.isEmpty()){
            Pair re=q.poll();
            arr[re.i][re.j]='T';
            for(int d[]:directions){
                int nRow=re.i+d[0];
                int nCol=re.j+d[1];
                if(nRow>=0&&nRow<arr.length&&nCol>=0&&nCol<arr[0].length&&arr[nRow][nCol]=='O'){
                    arr[nRow][nCol]='T';
                    q.add(new Pair(nRow,nCol));
                }
            }
        }
    }
}
