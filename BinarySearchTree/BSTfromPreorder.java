package BinarySearchTree;

public class BSTfromPreorder {
    public static void main(String[] args) {

    }
    public static Node bst(int arr[], int index, int low,int upp){
        if(index==arr.length||arr[index]<low|| arr[index]>=upp){
            return null;
        }
        Node root=new Node(arr[index++]);
        root.left=bst(arr, index, low, root.data);
        root.right=bst(arr,index,root.data,upp);
        return root;
    }
}

