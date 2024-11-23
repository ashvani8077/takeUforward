package DoublyLinkedList;

public class DeleteAllOccurrence {
    public static void main(String[] args) {
        int arr[]={2,3,4,8,9,2,6,5,3,5,6,2};
        Node head=arrayToLinkedList(arr);
        head=deleteAll(head,2);
        System.out.println(head.data);
    }
    public static Node arrayToLinkedList(int arr[]){
        Node head=new Node(arr[0]);
        Node pre=head;
        for (int i=1;i< arr.length;i++){
            Node temp=new Node(arr[i], null, pre);
            pre.next=temp;
            pre=pre.next;
        }
        return head;
    }

    public static Node deleteAll(Node head,int t){
        Node temp=head;
        while (temp!=null){
            if(temp.data==t){
                if(temp.back==null){
                    head=head.next;
                    if(head!=null){
                        head.back=null;
                    }
                }
                else if(temp.next==null) {
                    temp.back.next = null;

                }
                else{
                    temp.back.next=temp.next;
                    temp.next.back=temp.back;
                }
                temp = (temp.back != null) ? temp.back.next : head;
            }
            else {
                temp=temp.next;
            }
        }
        return head;
    }
}
