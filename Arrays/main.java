package Arrays;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int n=2;
        int maxValue=5;
        List<Integer>li=new ArrayList<>();
        for(int i=1;i<=maxValue;i++){
            int arr[]=new int[n];
            arr[0]=i;
            int k=i;
            for(int j=1;j<n;j++){
                if(k%arr[j-1]==0){
                    arr[j]=k;

                }
                k++;
            }

        }
    }
}
