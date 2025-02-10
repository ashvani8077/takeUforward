package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class TopView {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> solution(Node root){
        int l=0;
        int r=0;
        find(root,l,r,0);
        Queue<Node>q=new ArrayDeque<>();
        Queue<Integer>index=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Boolean>filled=new ArrayList<>();
        for(int i=0;i<r-l+1;i++){
            filled.add(false);
            ans.add(null);
        }
        q.add(root);
        index.add(-1*l);
        while (!q.isEmpty()){
            Node temp=q.poll();
            int pos=index.poll();
            if(!filled.get(pos)){
                filled.set(pos,true);
                ans.set(pos, temp.data);
            }
            if(temp.left!=null){
                q.add(temp.left);
                index.add(pos-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                index.add(pos+1);
            }
        }
        return ans;
    }

    public static void find(Node root,int l, int r, int pos){
        if(root==null){
            return;
        }
        l=Math.min(l,pos);
        r=Math.max(r,pos);
        find(root.left,l,r,pos-1);
        find(root.right,l,r,pos+1);
    }
}
