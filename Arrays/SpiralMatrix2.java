package Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n=3;
        int arr[][]=new int[n][n];
        int ans[]=new int[n*n];
        int k=1;
        for(int i=0;i<ans.length;i++){
            ans[i]=k++;
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j%n][i/n]=ans[c];
                c++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
