package Tree;


import java.util.*;
import java.util.Scanner;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class ImplementationLevelWise {

    public static void display(Node root){
        if(root==null){
            System.out.println("Empty tree");
            return;
        }
        Queue<Node>q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp=q.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Root node value: ");
        int x=sc.nextInt();
        Node root=new Node(x);
        Queue<Node>q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp=q.poll();
            System.out.print("Add value for left of "+temp.data);
            int l=sc.nextInt();
            if(l!=-1){
                temp.left=new Node(l);
                q.add(temp.left);
            }
            System.out.print("Add value for right of "+temp.data);
            int r=sc.nextInt();
            if(r!=-1){
                temp.right=new Node(r);
                q.add(temp.right);
            }
        }
        display(root);
    }
}
