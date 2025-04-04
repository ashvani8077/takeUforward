package Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="naman";
        System.out.println(isPalindrome(s,0,s.length()));
    }
    public static boolean isPalindrome(String s, int i, int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(s,i+1,n);
    }
}
