package LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Node head=convertToArray(arr);
        printMiddle(head);
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
    public static void printMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
}
