package String;
import java.util.*;

public class WordSubset {
    public static void main(String[] args) {
        String s1[]={"amazon","apple","facebook","google","leetcode"};
        String s2[]={"e","o"};
        System.out.println(solution(s1,s2));
    }

    public static List<String> solution(String s1[], String s2[]){
        List<String>li=new ArrayList<String>();
        for(int i=0;i<s2.length;i++){
            String temp=s2[i];
            solv(temp, s1, li);
        }
        return li;
    }

    public static void solv(String temp, String s1[], List<String>li ){
        for(int i=0;i<s1.length;i++){
            if(s1[i].contains(temp)){
                li.add(s1[i]);
            }
        }
    }
}
