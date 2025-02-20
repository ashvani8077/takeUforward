package BinarySearchTree;

public class FindMinValue {
    public static void main(String[] args) {

    }
    public static int minValue(Node root){
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;

        }
        return temp.data;
    }
}
