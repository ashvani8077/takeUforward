//package Tree;
//
//public class CountNumberOfNodesInTree {
//    public static void main(String[] args) {
//
//    }
//
//    public static int count1(Node root, int count){
//        if(root==null){
//            return count;
//        }
//        count++;
//        count1(root.left,count);
//        count1(root.right,count);
//        return count;
//    }
//
//    public static int count2(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        return 1 + count1(root.left) + count1(root.right);
//    }
//}
