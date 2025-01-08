package Stack_and_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={4,12,5,3,1,2,5,3,1,2,4,6};
        //System.out.println(nge(arr));
    }
//    public static ArrayList<Integer> nge(int arr[]){
//        ArrayList<Integer>li=new ArrayList<>();
//        Stack<Integer>st=new Stack<>();
//        for (int i=arr.length-1;i>=0;i--){
//            while (!st.empty()&&st.peek()<=arr[i]){
//                st.pop();
//            }
//            if(st.empty()){
//                li.add(-1);
//            }
//            else{
//                li.add(st.peek());
//            }
//            st.push(arr[i]);
//        }
//        Collections.reverse(li);
//        return li;
//    }


    public static ArrayList<Integer> nge(int arr1[], int arr2[]){
        ArrayList<Integer>result=new ArrayList<>();
        HashMap<Integer, Integer>mp=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for (int i:arr2){
            while (!st.empty()&&st.peek()<i){
                mp.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0;i<arr1.length;i++){
            result.add(mp.getOrDefault(arr1[i],-1));
        }
        return result;
    }
}
