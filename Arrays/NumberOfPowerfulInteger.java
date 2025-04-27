package Arrays;

public class NumberOfPowerfulInteger {
    public static void main(String[] args) {
        int start=1;
        int finish=6000;
        int limit=4;
        String s="124";
        System.out.println(soliton(start,finish,limit,s));
    }
    public static int soliton(int start, int finish, int limit, String s){
        int temp=Integer.parseInt(s);
        int count=0;
        int log=temp;
        char ch='1';
        while (log<=finish && (ch-'0')<=limit){
            String t=ch+s;
            log=Integer.valueOf(t);
            if(log>=start&&log<=finish){
                count++;
            }
            ch=(char)(ch+1);
        }
        return count;
    }
}
