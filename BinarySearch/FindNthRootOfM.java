package BinarySearch;

public class FindNthRootOfM {
    public static void main(String[] args) {
        int n=1;
        int m=14;
        System.out.println(answerBinarySearch(n,m));
    }
    public static int answerBinarySearch(int n, int m){
        if(m==0){
            return 0;
        }
        int low=1;
        int high=m/n;
        while (low<=high){
            int mid=low+(high-low)/2;
            long root=(long)(Math.pow(mid,n));
            if(root>m){
                high=mid-1;
            }
            else if(root<m){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
