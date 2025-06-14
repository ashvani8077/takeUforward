package Tree;

import java.util.ArrayList;
import java.util.Arrays;

public class TopViewUsingRecursion {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer>solution(Node root){
        int l=0; int r=0;
        int bounds[]=new int[2];
        find(root,bounds,0);
        l=bounds[0];
        r=bounds[1];
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>level=new ArrayList<>();
        for(int i=0;i<r-l+1;i++){
            level.add(Integer.MAX_VALUE);
            ans.add(0);
        }
        Tview(root,-l,ans ,level,0);
        return ans;
    }

    public static void Tview(Node root, int pos, ArrayList<Integer>ans, ArrayList<Integer>level,int l){
        if(root==null){
            return;
        }
        if(level.get(pos)>l){
            level.set(pos,l);
            ans.set(pos,root.data);
        }
        Tview(root.left, pos-1,ans,level,l+1);
        Tview(root.right,pos+1,ans,level,l+1);
    }
    public static void find(Node root,int bounds[], int pos){
        if(root==null){
            return;
        }
        bounds[0]=Math.min(bounds[0],pos);
        bounds[1]=Math.max(bounds[1],pos);
        find(root.left,bounds,pos-1);
        find(root.right,bounds,pos+1);
    }
}
