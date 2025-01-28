package String;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    public static String solution(int n) {
        if (n == 1) {
            return "1";
        }
        String say = solution(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < say.length(); i++) {
            if (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
            } else {
                result.append(count).append(say.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }
}
