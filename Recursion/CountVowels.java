package Recursion;

public class CountVowels {
    public static void main(String[] args) {
        String s="avbsaxcea";
        System.out.println(count(s,0));
    }
    public static int count(String s, int i){
        if(i==s.length()){
            return 0;
        }
        if(s.charAt(i)==97 || s.charAt(i)==101 || s.charAt(i)==105 || s.charAt(i)==111 || s.charAt(i)==117){
            return 1+count(s,i+1);
        }
        else {
            return count(s,i+1);
        }
    }
}
