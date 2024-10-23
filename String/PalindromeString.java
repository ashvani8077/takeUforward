package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s="naman";
        int i=0;
        int j=s.length()-1;
        int count=0;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                count=5;
                break;
            }
            i++;
            j--;
        }
        if(count==0){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
