package Tree;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {

    }
    public static void flatten(Node root){
        if(root==null){
            return;
        }
        while (root!=null){
            if(root.left==null){
                root=root.right;
            }
            else{
                Node curr=root.left;
                while (curr.right!=null){
                    curr=curr.right;
                }
                curr.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }
    }
}
