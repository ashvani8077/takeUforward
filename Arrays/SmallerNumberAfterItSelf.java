package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class SmallerNumberAfterItSelf {
    public static void main(String[] args) {
        ArrayList<Integer>li=new ArrayList<>();
        int arr[]={5,2,6,1};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            li.add(count);
        }
        System.out.println(li);
    }
}
