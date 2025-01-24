package Backtrackig;
import java.util.*;

public class GenerateValidParentheses {
    public static void main(String[] args) {
        int n=3;
    }

    public static List<String> solution(int n){
        List<String> li=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        solve(li, curr, n);
        return li;
    }

    public static void solve(List<String>li,StringBuilder curr,int n){
        if(curr.length()==n*2){
            if(isValid(curr)){
                li.add(curr.toString());
            }return;
        }
        curr.append('(');
        solve(li,curr,n);
        curr.deleteCharAt(curr.length() - 1);
        curr.append(')');
        solve(li,curr,n);
        curr.deleteCharAt(curr.length() - 1);
    }

    public static boolean isValid(StringBuilder curr){
        int count=0;
        for(int i=0;i< curr.length();i++){
            if(curr.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                return false;
            }
        }

        return count==0;
    }
}
