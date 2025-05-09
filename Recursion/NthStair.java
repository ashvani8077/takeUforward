package Recursion;

public class NthStair {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solution(n));
    }
    public static int solution(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return solution(n-1)+solution(n-2);
    }
}
