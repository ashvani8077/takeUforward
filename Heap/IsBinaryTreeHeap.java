//package Heap;
//
//public class IsBinaryTreeHeap {
//    public static void main(String[] args) {
//
//    }
//    public static boolean isHeap(Node node){
//        int num=count(tree);
//        if(!CBT(node,0,num)){
//            return false;
//
//        }
//        Maxheap(root);
//    }
//
//    public static int count(Node root){
//        if(root==null){
//            return 0;
//        }
//        return 1+count(root.left)+count(root.right);
//    }
//
//    public static boolean CBT(Node root, int index, int total_nodes){
//        if(root==null){
//            return true;
//        }
//        if(index>=total_nodes){
//            return false;
//        }
//
//        return CBT(root.left, index*2+1, total_nodes)&&CBT(root.right, 2*index+2, total_nodes);
//    }
//
//    public static boolean Maxheap(Node root){
//        if(root.left!=null){
//            if(root.data<root.left.data){
//                return false;
//            }
//            if(!Maxheap(root.left)){
//                return false;
//            }
//        }
//        if(root.right!=null){
//            if(root.data<root.right.data){
//                return false;
//            }
//            return Maxheap(root.right);
//        }
//    }
//}
