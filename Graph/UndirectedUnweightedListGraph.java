package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UndirectedUnweightedListGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>li=new ArrayList<>();
        System.out.println("No.of vertex: ");
        int vertex=sc.nextInt();
        System.out.println("No. of edges: ");
        int edge=sc.nextInt();
        for(int i=0;i<vertex;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<li.size();i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            li.get(u).add(v);
            li.get(v).add(u);
        }

        for(int i=0;i<li.size();i++){
            ArrayList<Integer>temp=new ArrayList<>(li.get(i));{
                for(int j=0;j<temp.size();j++){
                    System.out.println(li.get(i)+"   "+temp.get(j));
                }
            }
        }
    }
}
