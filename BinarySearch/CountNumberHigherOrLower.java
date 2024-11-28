//package BinarySearch;
//
//public class CountNumberHigherOrLower {
//    public static void main(String[] args) {
//        int n=10;
//        int pick=6;
//    }
//
//    public static int solution(int n){
//        int l=1;
//        int r=n;
//        while (l<=r){
//            int mid=(l+r)/2;
//            int val=guess(mid);
//            if(val==0){
//                return mid;
//            }
//            else if(val==-1){
//                r=mid-1;
//            }
//            else{
//                l=mid+1;
//            }
//        }
//        return -1;
//    }
//}
