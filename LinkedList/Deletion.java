package LinkedList;

import com.sun.source.tree.WhileLoopTree;

public class Deletion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Node head=convertToArray(arr);
        System.out.println(head.data);
        System.out.println(deletionHead(head).data);
        System.out.println(deleteTail(head).data);
        System.out.println(deleteByPosition(4,head).data);
        System.out.println(deleteByValue(head,3).data);
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



    public static Node deletionHead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }


    public static Node deleteTail(Node head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }


    public static Node deleteByPosition(int pos, Node head){
        if(head==null){
            return head;
        }
        if(pos==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node pre=null;
        int count=0;
        while (temp!=null && count<pos){
            count++;
            pre=temp;
            temp=temp.next;
        }

        if(temp!=null&&pre!=null){
            pre.next=temp.next;
        }
        return head;
    }



    public static Node deleteByValue(Node head, int val){
        if(head==null){
            return head;
        }
        if(head.data==val){
            head=head.next;
            return head;
        }

        Node temp=head;
        Node pre=null;
        while (temp!=null){
            if(temp.data==val){
                pre.next=temp.next;
                break;
            }
            pre=temp;
            temp=temp.next;
        }
        return head;
    }
}
