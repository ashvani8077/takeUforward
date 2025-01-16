package TwoPointer;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] arr = s.trim().split("\\s+");
        int i=0;
        int j=arr.length-1;
        while (i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String ans=String.join(" ",arr);
        System.out.println(ans);
    }
}
