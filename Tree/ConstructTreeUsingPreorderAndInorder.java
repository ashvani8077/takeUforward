package Tree;

public class ConstructTreeUsingPreorderAndInorder {
    public static void main(String[] args) {

    }
    public static Node preorder(int in[], int pre[]){
        return tree(in, pre, 0, in.length-1, 0);
    }
    public static Node tree(int in[], int pre[], int start, int end,int index){
        if(start>end){
            return null;
        }

        Node root=new Node(pre[index]);
        int pos=find(in,start,end,root.data);
        root.left=tree(in,pre,start,pos-1,index+1);
        root.right=tree(in, pre,pos+1,end,index+(pos-start)+1);
        return root;
    }

    public static int find(int arr[], int start, int end, int t){
        for (int i=start;i<=end;i++){
            if(arr[i]==t){
                return i;
            }

        }
        return -1;
    }
}
