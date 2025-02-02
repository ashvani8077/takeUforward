package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeftView {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> solution(Node root){
        ArrayList<Integer>li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<Node>q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int n=q.size();
            li.add(q.peek().data);
            while (n>0){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                n--;
            }
        }
        return li;
    }
}
