package Arrays;

import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=4;
        ArrayList<Integer>li=new ArrayList<>();
        while (n>0){
            int mod=n%2;
            li.add(mod);
            n=n/2;
        }

    }
}
