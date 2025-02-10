package Tree;

import java.util.ArrayList;
import java.util.List;

public class MoorisPreorder {
    public static void main(String[] args) {

    }
    public static List<Integer> preorder(Node root){
        List<Integer>ans=new ArrayList<>();
        while (root!=null){
            if(root.left==null){
                ans.add(root.data);
                root=root.right;
            }
            else{
                Node curr=root.left;
                while (curr!=null){
                    curr=curr.right;
                }
                if(curr.right==null){
                    ans.add(root.data);
                    curr.right=root;
                    root=root.left;
                }
                else{
                    curr.right=null;
                    root=root.right;
                }
            }
        }
        return ans;
    }
}
