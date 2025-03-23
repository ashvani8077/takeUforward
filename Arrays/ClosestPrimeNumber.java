package Arrays;

public class ClosestPrimeNumber {
    public static void main(String[] args) {
        int left=10;
        int right=19;
        int ans[]=solution(left,right);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
    public static int []solution(int left, int right){
        int count=0;
        int a=-1;
        int b=-1;
        int k=0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                if(count==0){
                    a=i;
                    count++;
                }
                else if(count==1){
                    b=i;
                    break;
                }
                count++;
            }
        }
        int ans[]={-1,-1};
        if(a!=-1&&b!=-1){
            ans[0]=a;
            ans[1]=b;
        }
        return ans;
    }

    public static boolean isPrime(int k){
        int m=0;
        for(int i=1;i<=k;i++){
            if(k%i==0){
                m++;
            }
        }
        if(m==2){
            return true;
        }
        return false;
    }
}
