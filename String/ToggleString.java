package String;

public class ToggleString {
    public static void main(String[] args) {
        String s = "thIs is javAtpOiNt";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        String ans=sb.toString();
        System.out.println(ans);
    }
}
