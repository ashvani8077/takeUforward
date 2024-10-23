package Arrays;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String ans="";
        StringTokenizer st = new StringTokenizer("Let's my name is khan"," ");
        while (st.hasMoreTokens()){
            StringBuffer sb=new StringBuffer(st.nextToken());
            sb.reverse();
            ans=ans+" "+sb.toString();
        }
        System.out.println(ans);
    }
}
