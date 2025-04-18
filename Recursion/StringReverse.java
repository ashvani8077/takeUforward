package Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String s="abcde";
        System.out.println(reverse(s,0));
    }
    public static String reverse(String s, int idx){
        if(idx>=s.length()){
            return "";
        }
        String a=reverse(s,idx+1);
        //System.out.println(s.charAt(idx));
        return a+s.charAt(idx);
    }
}
