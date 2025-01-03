package Arrays;

import java.util.ArrayList;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int arr[]={1,2,0,0};
        int k=34;
        System.out.println(listUpdate(arr,k));
    }
    public static ArrayList<Integer>listUpdate(int arr[],int k){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s*10;
            s=s+arr[i];
        }
        s=s+k;
        String st=String.valueOf(s);
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<st.length();i++){
            li.add(Integer.valueOf(st.charAt(i)-'0'));
        }
        return li;
    }
}
