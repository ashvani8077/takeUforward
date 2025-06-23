package Graph;

import java.util.HashMap;

public class DisJointSet {
    class Node{
        int val;
        int rank;
        Node parent;
    }
    private HashMap<Integer,Node>map=new HashMap<>();
    public void createSet(int v){
        Node nn=new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }

    public int findParent(int v){
        Node nn=map.get(v);
        return findParent(nn).val;
    }
    private Node findParent(Node nn){
        if(nn.parent != nn){
            nn.parent = findParent(nn.parent);
        }
        return nn.parent;
    }


    public void union(int v1, int v2){
        Node n1=map.get(v1);
        Node n2=map.get(v2);
        Node rn1=findParent(n1);
        Node rn2=findParent(n2);
        if(rn1.rank==rn2.rank){
            rn1.parent=rn2;
            rn2.rank++;
        }
        else if(rn1.rank>rn2.rank){
            rn2.parent=rn1;
        }
        else{
            rn1.parent=rn2;
        }
    }
}
