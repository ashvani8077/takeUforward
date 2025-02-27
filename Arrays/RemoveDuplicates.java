package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,3,2,4};
        System.out.println(removeDuplicate(arr));
    }
    public static int removeDuplicate(int arr[]){
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size();
    }
}
