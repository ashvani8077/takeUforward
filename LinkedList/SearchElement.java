package LinkedList;

public class SearchElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=convertToLinkedList(arr);
        System.out.println(isPresent(head,5));
    }

    public static boolean isPresent(Node head, int value){
        Node temp=head;
        while (temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
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
