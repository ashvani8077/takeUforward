package String;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num=3749;
        System.out.println(roman(num));
    }

    public static String roman(int num){
        String res="";
        int number[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String map[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<number.length;i++){
            int time=num/number[i];
            num=num%number[i];
            for(int j=1;j<=time;j++){
                res=res+map[i];
            }
        }
        return res;
    }
}
