package LinkedList;

//class Node{
//    int data;
//    Node next;
//    Node(int data, Node next){
//        this.data=data;
//        this.next=next;
//    }
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
public class ArrayToLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(convertToLinkedList(arr).data);
    }

    public static Node convertToLinkedList(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
}
