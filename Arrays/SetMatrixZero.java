package Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        //brute(arr);
        better(arr);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void brute(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    markRow(i,arr);
                    markColumn(j,arr);
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void markRow(int i, int arr[][]){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }

    public static void markColumn(int j,int arr[][]){
        for(int i=0;i<arr.length;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }


    public static void better(int arr[][]){
        int row[]=new int[arr.length];
        int col[]=new int[arr[0].length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(row[i]==1||col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }

}




//Brute--->>
//    use two functions one for row=0 and another for column=0;
//    TIme Complexity=(n*m)+(n*m)+(n*m)=(n*m)^3



//Better---->>
//    Use two array for track of row and column which have to make 0;
//    Time Complexity=o(2*n*m);
//    Space Complexity=O(n)+O(m);