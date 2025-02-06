package Tree;
import java.util.ArrayList;
import java.util.List;
public class DiagonalOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> Diagonal(Node root){
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int l=find(root,0);
        for(int i=0;i<l+1;i++){
            ans.add(new ArrayList<>());
        }
        DiagonalFind(root, 0,ans);
        return ans;
    }
    public static int find(Node root, int pos){
        if (root == null) {
            return pos;
        }

        int leftMax = find(root.left, pos + 1);
        int rightMax = find(root.right, pos);

        return Math.max(leftMax, rightMax);

    }
    public static void DiagonalFind(Node root, int pos, List<List<Integer>>ans){
        if(root==null){
            return;
        }
        ans.get(pos).add(root.data);
        DiagonalFind(root.left,pos+1,ans);
        DiagonalFind(root.right,pos,ans);
    }
}
