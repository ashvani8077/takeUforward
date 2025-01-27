package Recursion;

public class PowXN {
    public static void main(String[] args) {
        double x=2.100;
        int n=3;
        System.out.println(result(x,n));
    }

    public static double result(double x,int n){
        if(n==0){
            return 1;
        }
        return x*result(x,n-1);
    }
}
