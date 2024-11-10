package DoublyLinkedList;

public class CompleteDoublyLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=arrayToLinkedList(arr);
        display(head);
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

    public static void display(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }


    public static Node deleteHead(Node head){
        if(head==null||head.next==null){
            return null;
        }
        head=head.next;
        head.back=null;
        return head;
    }


    public static Node deleteTail(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node pre=tail.back;
        tail.back=null;
        pre.next=null;
        return head;
    }


    public static Node deletePosition(Node head, int pos){
        if(head==null){
            return null;
        }
        Node KNode=head;
        int count=0;
        while (KNode!=null){
            count++;
            if(count==pos){
                break;
            }
            KNode=KNode.next;
        }
        Node pre=KNode.back;
        Node front=KNode.next;
        if(pre==null&&front==null){
            return null;
        }
        else if(pre==null){
            return deleteHead(head);
        }
        else if (front==null){
            return deleteTail(head);
        }
        pre.next=front;
        front.back=pre;
        KNode.next=null;
        KNode.back=null;
        return head;
    }


    public static void deleteNodeWithValue(Node temp){
        Node front=temp.next;
        Node pre=temp.back;
        if(front==null){
            pre.next=null;
            temp.back=null;
            return;
        }
        pre.next=front;
        front.back=pre;
        temp.back=null;
        temp.next=null;
    }


    public static Node insertBeforeHead(Node head, int val){
        Node temp=new Node(val);
        temp.next=head;
        temp.back=null;
        head.back=temp;
        head=temp;
        return head;
    }
}

