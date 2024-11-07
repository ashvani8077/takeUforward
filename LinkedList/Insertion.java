package LinkedList;

public class Insertion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Node head=convertToArray(arr);
        System.out.println(insertHead(head,8).data);
        System.out.println(insertTail(head,5).data);
        System.out.println(insertAtPosition(head,3,10).data);
        System.out.println(insertBeforeValue(head,5,32).data);

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

    public static Node insertHead(Node head, int val){
        Node temp=new Node(val,head);
        return temp;
    }


    public static Node insertTail(Node head, int val){
        Node nn=new Node(val, null);
        if(head==null){
            return nn;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        return head;
    }


    public static Node insertAtPosition(Node head, int pos, int val){
        if(head==null){
            if(pos==1){
                return new Node(val,head);
            }
            else {
                return null;
            }
        }
        if(pos==1){
            Node temp=new Node(val,head);
            return temp;
        }
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            if(count==pos-1){
                Node x=new Node(val);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }


    public static Node insertBeforeValue(Node head, int value, int ele){
        if(head==null){
            return null;
        }
        if(head.data==value){
            Node temp=new Node(ele, head);
            return temp;
        }
        Node temp=head;
        while (temp.next!=null){
            if(temp.next.data==value){
                Node nn=new Node(ele);
                nn.next=temp.next;
                temp.next=nn;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }
}
