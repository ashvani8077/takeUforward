package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={6,7,8,4,1};
        System.out.println(index(arr,4));
    }

    public static int index(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
