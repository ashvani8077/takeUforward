package AVL_Tree;

class  Node{
    int data;
    int height;
    Node left, right;
    Node(int value){
        data=value;
        height=1;
        left=right=null;
    }
}
public class AVL_Tree {
    public static void main(String[] args) {
        Node root=null;
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,50);
        root=insert(root,70);
        root=insert(root,5);
        root=insert(root,100);
        root=insert(root,95);
        preorder(root);
        System.out.println();
        inorder(root);
    }

    public static Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
        }
        else{
            return root;
        }
        //update height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));

        //check balancing
        int balance=getBalance(root);

        //left left Case
        if(balance>1&&key<root.left.data){
            return rightRotation(root);
        }
        //right right case
        else if(balance<-1&&root.right.data<key){
            return leftRotation(root);
        }
        //left right case
        else if(balance>1&&key>root.left.data){
            root.left=leftRotation(root.left);
            return rightRotation(root);
        }
        //right left case
        else if(balance<-1&&root.right.data>key){
            root.right=rightRotation(root.right);
            return leftRotation(root);
        }
            return root;
        //no unbalance
    }

    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    public static int getBalance(Node root){
        return getHeight(root.left)-getHeight(root.right);
    }

    //Rigth Rotation
    public static Node rightRotation(Node root){
        Node child=root.left;
        Node childRight=child.right;
        child.right=root;
        root.left=childRight;
        //Update Height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));
        child.height=1+Math.max(getHeight(child.left),getHeight(child.right));
        return child;
    }

    //Left Rotation
    public static Node leftRotation(Node root){
        Node child=root.right;
        Node childLeft=child.left;
        child.left=root;
        root.right=childLeft;
        //Update Height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));
        child.height=1+Math.max(getHeight(child.left),getHeight(child.right));
        return child;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
