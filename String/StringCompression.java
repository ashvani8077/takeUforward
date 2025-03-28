package String;

public class StringCompression {
    public static void main(String[] args) {
        char ch[]={'a','a','b','b','c','c','c'};
        System.out.println(compression(ch));
    }

    public static int compression(char ch[]){
        int count=1;
        int track=0;
        for(int i=1;i<ch.length;i++){
            char pre=ch[i-1];
            char current=ch[i];
            if(pre==current){
                count++;
            }
            else{
                ch[track++]=pre;
                if(count>1){
                    String st=String.valueOf(count);
                    for(int j=0;j<st.length();j++){
                        ch[track++]=st.charAt(j);
                    }
                }
                count=1;
            }
        }

        ch[track++] = ch[ch.length - 1];
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (int j = 0; j < countStr.length(); j++) {
                ch[track++] = countStr.charAt(j);
            }
        }
        return track;
    }
}
