package BinarySearchTree;

public class Implementation {

    public static void main(String[] args) {
        int arr[]={3,7,4,1,6,8};
        Node root=null;
        for (int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
    }

    public static Node insert(Node root, int data){
        if(root==null){
            Node temp=new Node(data);
            return temp;
        }
        if(data< root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
}
