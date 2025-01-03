package Arrays;

public class CellsWithOddValueInAMatrix {
    public static void main(String[] args) {
        int arr[][]={{0,0},{0,0}};
        int m=2;
        int n=3;
        int ind[][]={{1,1},{0,0}};
        for(int i=0;i<ind.length;i++){
            for(int j=0;j<ind[i].length;j++){
                int a=ind[i][j];
                update(arr,a,j);
            }
        }
        System.out.println(count(arr));

    }
    public static void update(int arr[][],int a, int j){
        if(j%2==0){
            for(int i=0;i<arr[j].length;i++){
                arr[a][i]+=1;
            }
        }
        if(j%2==1){
            for(int i=0;i<arr.length;i++){
                arr[i][a]+=1;
            }
        }
    }
    public static int count(int arr[][]){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    c++;
                }
            }
        }
        return c;
    }

}
