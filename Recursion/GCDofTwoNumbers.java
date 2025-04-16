package Recursion;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        int n1=48;
        int n2=18;
        System.out.println(gcd(n1,n2));
    }
    public static int gcd(int n1, int n2){
        if(n2==0){
            return n1;
        }

        return gcd(n2,n1%n2);
    }
}
