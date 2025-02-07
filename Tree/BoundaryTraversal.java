package Tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    public static void main(String[] args) {

    }
    public static List<Integer> boundary(Node root){
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        ans.add(root.data);
        leftSub(root.left,ans);
        if(root.left!=null||root.right!=null){
            leaf(root, ans);
        }
        rightSub(root.right, ans);
        return ans;
    }

    public static void leftSub(Node root, List<Integer>ans){
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        ans.add(root.data);
        if(root.left!=null){
            leftSub(root.left,ans);
        }
        else{
            leftSub(root.right,ans);
        }

    }

    public static void leaf(Node root, List<Integer>ans){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            ans.add(root.data);
        }
        leaf(root.left,ans);
        leaf(root.right,ans);
    }

    public static void rightSub(Node root, List<Integer>ans){
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        if(root.right!=null){
            rightSub(root.right,ans);
        }
        else{
            rightSub(root.left,ans);
        }
        ans.add(root.data);
    }
}
