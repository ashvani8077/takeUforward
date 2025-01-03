package Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        int i=0;
        int j=arr.length-1;
        while (i<arr.length&&j>=0){
            if(i!=j){
                sum+=arr[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
