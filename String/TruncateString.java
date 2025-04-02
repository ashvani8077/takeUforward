package String;

public class TruncateString {
    public static void main(String[] args) {
        String s="What is the solution to this problem";
        int k=4;
        System.out.println(solution(s,k));
    }

    public static String solution(String s,int k){
        String arr[]=s.split(" ");
        String ans="";
        int i=0;
        for(i=0;i<=k-2;i++){
            ans=ans+arr[i];
            ans+=" ";
        }
        i=k-1;
        ans=ans+arr[i];
        return ans;
    }
}
