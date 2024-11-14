package LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Node head=convertToArray(arr);
        System.out.println(isPalindrome(head));
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

    public static boolean isPalindrome(Node head) {
        String s="";
        Node temp=head;
        while(temp!=null){
            s=s+temp.data;
            temp=temp.next;
        }
        StringBuilder sb= new StringBuilder(s);
        sb=sb.reverse();
        s=String.valueOf(sb);
        temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data!=(s.charAt(i)-'0')){
                return false;
            }
            i++;
            temp=temp.next;
        }
        return true;
    }
}
