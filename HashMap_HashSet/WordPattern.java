package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public static void main(String[] args) {
        String p = "abba";
        String s = "dog cat cat dog";
        System.out.println(solution(p, s));

    }

    public static boolean solution(String p, String s) {
        String[] str = s.split(" ");

        if (p.length() != str.length) {
            return false;
        }

        HashMap<String, Character> mp = new HashMap<>();
        HashSet<Character> use = new HashSet<>();

        for (int i = 0; i < p.length(); i++) {
            char t = p.charAt(i);
            String word = str[i];

            if (mp.containsKey(word)) {
                if (mp.get(word) != t) {
                    return false;
                }
            } else {
                if (use.contains(t)) {
                    return false;
                }
                mp.put(word, t);
                use.add(t);
            }
        }

        return true;
    }
}
