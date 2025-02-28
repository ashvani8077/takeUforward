package Arrays;

public class NumberWithEvenNumberDigits {
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896};
        System.out.println(countEven(arr));
    }
    public static int countEven(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            String s=String.valueOf(arr[i]);
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
