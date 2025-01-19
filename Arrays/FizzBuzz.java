package Arrays;
import java.util.*;
import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=5;
        System.out.println(solution(n));
    }
    public static List<String>solution(int n){
        List<String>li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                li.add("FizzBuzz");
            }
            else if(i%3==0){
                li.add("Fizz");
            }
            else if(i%5==0){
                li.add("Buzz");
            }
            else{
                li.add(String.valueOf(i));
            }
        }
        return li;
    }
}
