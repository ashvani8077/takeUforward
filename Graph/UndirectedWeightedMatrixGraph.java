package Graph;
import java.util.*;
import java.util.Scanner;

public class UndirectedWeightedMatrixGraph {

    //Adjacency matrix
    //undirected weighted graph
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges= sc.nextInt();
        int arr[][]=new int[vertex][vertex];
        // Arrays.fill(arr,0);
        int u,v, weight;
        for (int i=0;i<edges;i++){
            u= sc.nextInt();
            v=sc.nextInt();
            weight=sc.nextInt();
            arr[u][v]=weight;
            arr[v][u]=weight;
        }

        //print
        for (int i=0;i<vertex;i++){
            for (int j=0;j<vertex;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
