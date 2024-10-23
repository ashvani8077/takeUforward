package String;

public class ReverseString2 {
    public static void main(String[] args) {
        String s="this is javatpoint";
        char []arr=s.toCharArray();
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i];
        }
        System.out.println(ans);
    }
}
