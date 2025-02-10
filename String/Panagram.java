package String;

public class Panagram {
    public static void main(String[] args) {
        String str="thequickbronfoxjumpsoverthelazydog";
        System.out.println(isPanagram(str));
    }
    public static char isPanagram(String s){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[(s.charAt(i)-'a')]++;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return (char)(i+'a');
            }
        }
        return '0';
    }
}
