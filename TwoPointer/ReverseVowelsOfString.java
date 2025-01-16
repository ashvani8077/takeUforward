package TwoPointer;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        char []arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(!isVowel(arr,i)){
                i++;
            }
            else if(!isVowel(arr,j)){
                j--;
            }
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        String ans=new String(arr);
        return ans;
    }

    public static boolean isVowel(char arr[], int i){
            if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                return true;
            }
            return false;
    }

    public static void swap(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
