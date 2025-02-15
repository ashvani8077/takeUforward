package BinarySearchTree;

public class BSTfromPostorder {
    public static void main(String[] args) {

    }
    public static Node bst(int arr[], int index, int low,int upp){
        if(index==-1||arr[index]<low|| arr[index]>=upp){
            return null;
        }
        Node root=new Node(arr[index--]);
        root.right=bst(arr,index,root.data,upp);
        root.left=bst(arr, index, low, root.data);

        return root;
    }
}
