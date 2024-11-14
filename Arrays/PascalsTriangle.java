package Arrays;
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(generate(n));

    }
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        if(n>=1){
            List<Integer>li=new ArrayList<>();
            li.add(1);
            ans.add(li);
        }
        for(int i=1;i<n;i++){
            List<Integer>pre=ans.get(i-1);
            List<Integer>fill=new ArrayList<>();
            fill.add(1);
            for(int j=1;j<i;j++){
                fill.add(pre.get(j-1)+pre.get(j));
            }
            fill.add(1);
            ans.add(fill);
        }
        return ans;
    }
}
