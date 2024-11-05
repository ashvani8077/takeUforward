package Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int ans[]=Brute(arr);
        for (int i:ans){
            System.out.print(i+"  ");
        }
        System.out.println();
        int ans2[]=Optimal(arr);
        for (int i:ans2){
            System.out.print(i+"   ");
        }
    }

    public static int [] Brute(int arr[]) {
        int pos[] = new int[arr.length / 2];
        int neg[] = new int[arr.length / 2];
        int p = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[p] = arr[i];
                p++;
            } else {
                neg[n] = arr[i];
                n++;
            }
        }

        int ans[]=new int[arr.length];
        p=0;
        n=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                ans[i]=pos[p];
                p++;
            }
            else{
                ans[i]=neg[n];
                n++;
            }
        }
        return ans;
    }


    public static int [] Optimal(int arr[]){
        int ans[]=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
}






//    Brute---->>
//      make two seperate arrays for both positive and negative
//      Time Complexity=n+n=O(2n)


//Optimal--->>
//    Simply Iterate with even and odd index
//    Time Complexity=O(n)
