package String;

public class LongestSubString {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(solution(s));
    }

    public static int solution(String s){
        int lon=0;
        char last=s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-0)==last+1){
                count++;
            }
            else{
                count=1;
            }
            lon=Math.max(lon,count);
        }
        return lon;
    }
}
