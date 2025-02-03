package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumLevelOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int maximumSum(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node>q=new ArrayDeque<>();
        int ans=1;
        int max=Integer.MIN_VALUE;
        int level=1;
        q.add(root);
        while (!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=1;i<=size;i++){
                Node temp=q.poll();
                sum+=temp.data;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }

            if(sum>=max){
                max=sum;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}
