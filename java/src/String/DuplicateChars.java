package String;

import java.util.HashMap;

public class DuplicateChars {
    public static void main(String[] args) {

        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " : " + map.get(ch));
            }
        }
    }
}
