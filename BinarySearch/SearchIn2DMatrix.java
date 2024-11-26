package BinarySearch;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searchMatrix(arr,6));
        System.out.println(binarySearch(arr,6));
    }
    public static boolean searchMatrix(int arr[][], int k){
        int m=arr.length;
        int n=arr[0].length;
        int i=0;
        int j=n-1;
        while (i<m&&j>=0){
            if(arr[i][j]>k){
                j--;
            }
            else if(arr[i][j]<k){
                i++;
            }
            else{
                return true;
            }
        }
        return false;

    }


    public static boolean binarySearch(int arr[][],int k){
        int m=arr.length;
        int n=arr[0].length;
        int start=0;
        int end=(m*n)-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid/n][mid%n]>k){
                end=mid-1;
            }
            else if(arr[mid/n][mid%n]<k){
                start=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
