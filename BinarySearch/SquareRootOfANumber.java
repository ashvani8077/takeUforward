package BinarySearch;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        int n=36;
    }

    public static int sqrtBinarySearch(int n){
        if(n==0||n==1){
            return n;
        }
        int low=1;
        int high=n/2;
        while (low<=high){
            int mid=low+(high-low)/2;
            int sqrt=mid*mid;
            if(sqrt>n){
                high=mid-1;
            }
            else if(sqrt<n){
                low=mid+1;
            }
            else {
                return mid;
            }
        }
        return high;
    }
}
