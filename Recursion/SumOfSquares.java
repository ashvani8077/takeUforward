package Recursion;

public class SumOfSquares {
    public static void main(String[] args) {

    }
    public static int sqSum(int n ){
        if(n==1){
            return 1;
        }
        return (n*n)+sqSum(n-1);
    }
}
