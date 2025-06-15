package Recursion;

public class SumFirstNNumbers {
    public static void main(String[] args) {
        int n=3;
        System.out.println(sumOfNumbers(n));
    }
    public static int sumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNumbers(n-1);
    }
}
