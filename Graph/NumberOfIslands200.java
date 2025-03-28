package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands200 {
    public static void main(String[] args) {
        char grid[][] = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

    }
    static class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }

    public static int answer(char[][]grid){
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    bfs(grid, visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void bfs(char grid[][], boolean visited[][], int i,int j){
        int [][]directions={
                {0,1},
                {1,0},
                {0,-1},
                {-1,0}
        };
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        while (!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.i, y=curr.j;
            if(x<0||x>= grid.length||y<0||y>=grid[0].length||visited[x][y]||grid[x][y]=='0'){
                continue;
            }
            visited[x][y]=true;
            for(int []dir:directions){
                int newX=x+dir[0];
                int newY=y+dir[1];
                q.add(new Pair(newX, newY));
            }
        }
    }
}
