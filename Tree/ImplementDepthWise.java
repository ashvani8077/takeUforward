package Tree;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ImplementDepthWise {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the root Node: ");
        Node root = BinaryTree();

        display(root);
    }


    public static Node BinaryTree() {
        int x = sc.nextInt();
        if (x == -1) {
            return null;
        }
        Node temp = new Node(x);
        System.out.print("Enter thr Left child of "+x);
        temp.left = BinaryTree();
        System.out.print("Enter the Right child  of "+x);
        temp.right = BinaryTree();
        return temp;
    }


    public static void display(Node root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}