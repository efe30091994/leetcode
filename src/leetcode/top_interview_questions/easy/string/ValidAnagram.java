package leetcode.top_interview_questions.easy.string;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.computeIfPresent(c, (key, value) -> value + 1);
            sMap.putIfAbsent(c, 1);
        }
        for (char c : t.toCharArray()) {
            tMap.computeIfPresent(c, (key, value) -> value + 1);
            tMap.putIfAbsent(c, 1);
        }
        return sMap.equals(tMap);
    }
}
