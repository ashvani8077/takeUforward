package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        System.out.println(missingBrute(arr,n));
        System.out.println(missingBetter(arr,n));
        System.out.println(missingOptimalSum(arr,n));
        System.out.println(missingOptimalXOR(arr,n));
    }

    public static int missingBrute(int arr[],int n){
        for(int i=1;i<n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }



    public static int missingBetter(int arr[], int n) {
        int hash[] = new int[n + 1];
        for (int i = 0; i < n - 1; i++)
            hash[arr[i]]++;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }



    public static int missingOptimalSum(int arr[],int n){
        int sum=(n*(n+1))/2;
        int temp=0;
        for (int i:arr){
            temp=temp+i;
        }
        return sum-temp;
    }


    public static int missingOptimalXOR(int arr[],int N){
        int xor1=0;
        int xor2=0;
        int n=N-1;
        for (int i=0;i<n;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^N;
        return xor1^xor2;
    }
}




//    Brute---->>
//        Use two for loop 1 for counting and another for check
//        Time Complexity=O(n2)



//    Better--->>
//        Use hashing
//        Time Complexity=O(2n)



//    Optimal1--->>
//        Summming all the element using n*n+1/2 and then subtract
//        Time Complexity=O(n)


//    Optimal2---->>
//        Xor
//        Time Complexity=O(n)
