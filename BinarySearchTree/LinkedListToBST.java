package BinarySearchTree;

import java.util.ArrayList;

public class LinkedListToBST {
    public static void main(String[] args) {

    }
    public static Node solution(Node head){
        ArrayList<Integer>li=new ArrayList<>();
        while (head!=null){
            li.add(head.data);
           // head=head.next;
        }
        return bst(li, 0,li.size()-1);
    }
    public static Node bst(ArrayList<Integer>li, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end+1)/2;
        Node temp=new Node(li.get(mid));
        temp.left=bst(li,start,mid);
        temp.right=bst(li,mid,end);
        return temp;
    }
}
