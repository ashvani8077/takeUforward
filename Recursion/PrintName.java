package Recursion;

public class PrintName {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Ashvani Sharma"+n);
        print(n-1);
        System.out.println("Ashvani Sharma"+n);

    }
}
