package LinkedList;

public class AddTwoList {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        Node t1=l1;
        Node t2=l2;
        int carry=0;
        while(t1!=null||t2!=null){
            int sum=carry;
            if(t1!=null){
                sum+=t1.data;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.data;
                t2=t2.next;
            }
            Node temp=new Node(sum%10);
            carry=sum/10;

            curr.next=temp;
            curr=curr.next;
        }
        if(carry>0){
            Node temp=new Node(carry);
            curr.next=temp;
        }
        return dummyNode.next;
    }
}
