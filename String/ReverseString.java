package String;

public class ReverseString {
    public static void main(String[] args){
        String s="this is javatpoint";
        String[]arr=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i];
            if(i!=0){
                ans=ans+" ";
            }
        }
        System.out.println(ans);
    }
}
