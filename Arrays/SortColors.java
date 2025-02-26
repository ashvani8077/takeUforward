package Arrays;

public class SortColors {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sortColor(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sortColor(int arr[]){
        int zero=0;
        int one=0;
        int two=0;
        for(int i:arr){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else{
                arr[i]=2;
                two--;
            }
        }
    }
}
