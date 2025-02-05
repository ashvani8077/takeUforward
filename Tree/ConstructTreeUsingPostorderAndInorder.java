package Tree;

public class ConstructTreeUsingPostorderAndInorder {
    public static void main(String[] args) {

    }
    public static Node postorder(int in[], int post[]){
        return tree(in, post, 0, in.length-1, 0);
    }
    public static Node tree(int in[], int post[], int start, int end,int index){
        if(start>end){
            return null;
        }

        Node root=new Node(post[index]);
        int pos=find(in,start,end,root.data);
        root.right=tree(in,post,pos+1,end,index-1);
        root.left=tree(in,post,start,pos-1,index-(end-pos)-1);
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