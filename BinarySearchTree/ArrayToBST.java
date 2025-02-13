package BinarySearchTree;

public class ArrayToBST {
    public static void main(String[] args) {
        int arr[]={-10,-3,0,5,9};
    }
    public static Node BST(int arr[]){
        return solution(arr,0,arr.length-1);
    }
    public static Node solution(int arr[], int left, int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        Node temp=new Node(arr[mid]);
        temp.left=solution(arr, left,mid-1);
        temp.right=solution(arr,mid+1,right);
        return temp;
    }
}
