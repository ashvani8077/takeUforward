package Graph;
import java.util.*;
import java.util.Scanner;

public class UndirectedUnweightedMatrixGraph {

    //Adjacency matrix
    //undirected unweighted graph
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges= sc.nextInt();
        int arr[][]=new int[vertex][vertex];
        // Arrays.fill(arr,0);
        int u,v;
        for (int i=0;i<edges;i++){
            u= sc.nextInt();
            v=sc.nextInt();
            arr[u][v]=1;
            arr[v][u]=1;
        }

        //print
        for (int i=0;i<vertex;i++){
            for (int j=0;j<vertex;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
}
