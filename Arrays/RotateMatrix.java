package Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        better(arr);

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static int [][] brute(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int ans[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[j][n-1-i]=arr[i][j];
            }
        }
        return ans;
    }


    public static void better(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for (int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }
}


//Brute--->>>
//    [i][j]--[j][n-i-1];
//    Time Complexity=O(n2);
//    Space Complexity=O(n2);



//Better--->>
//    first transpose the matrix and then reverse it
//    Time Complexity=(n2)