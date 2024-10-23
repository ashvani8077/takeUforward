package String;

public class Capitalize {
    public static void main(String[] args) {
        String s="this is javatpoint";
        String arr[]=s.split(" ");
        String result="";
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(temp.length()>0){
                result=result+Character.toUpperCase((temp.charAt(0)));
                result=result+temp.substring(1);
            }
            if(i<arr.length){
                result=result+" ";
            }
        }
        System.out.println(result);

    }
}
