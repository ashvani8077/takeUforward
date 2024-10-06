package Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1,0,1,1};
        System.out.println(once(arr));
    }


    public static int once(int arr[]){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(count,max);
            }
            else {
                count=0;
            }
        }
        return max;
    }
}



//    Brute-->>
//        Use counter and a maximum variabble
//        Time Complexity=O(n)
