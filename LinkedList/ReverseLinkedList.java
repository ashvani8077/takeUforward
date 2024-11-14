package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Node head=convertToArray(arr);
    }

    public static Node convertToArray(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }

    public static Node reverseLL(Node head){
        if(head==null){
            return null;
        }
        Node prev=null;
        Node curr=head;
        Node temp=null;
        while (curr!=null){
            temp=curr.next;
            curr.next= prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
