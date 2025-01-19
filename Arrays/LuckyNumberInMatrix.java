package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(lucky(arr));
    }

    public static ArrayList lucky(int arr[][]){
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int col=-1;
            int minRow=Integer.MAX_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<minRow){
                    minRow=arr[i][j];
                    col=j;
                }
            }
            if(maximumColumn(arr,col)==minRow){
                li.add(minRow);
            }
        }
        return li;
    }

    public static int maximumColumn(int arr[][],int col){
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]>temp){
                temp=arr[i][col];
            }
        }
        return temp;
    }
}
