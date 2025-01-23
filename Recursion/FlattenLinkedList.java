//package Recursion;
//
//public class FlattenLinkedList {
//    public static void main(String[] args) {
//
//    }
//
//    public static Node flatten(Node head){
//        if(head==null){
//            return null;
//        }
//        Node head2=flatten(head.next);
//        return merge(head,head2);
//    }
//
//
//    public static Node merge(Node h1, Node h2){
//        if(h1==null){
//            return h2;
//        }
//        if(h2==null){
//            return h1;
//        }
//        ListNode result;
//        if(h1.val<h2.val){
//            result=h1;
//            result.bottom=merge(result.bottom, h2);
//        }
//        else{
//            result=h2;
//            result.bottom=merge(h1,result.bottom);
//        }
//        return result;
//    }
//}
