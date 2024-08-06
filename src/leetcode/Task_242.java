package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Task_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "aacc";
        String t1 = "ccac";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            sMap.computeIfPresent(s.charAt(i), (key, value) -> value + 1);
            sMap.putIfAbsent(s.charAt(i), 0);
            tMap.computeIfPresent(t.charAt(i), (key, value) -> value + 1);
            tMap.putIfAbsent(t.charAt(i), 0);
        }

        return sMap.equals(tMap);
    }

//    public static boolean isAnagram(String s, String t) {
//        String[] ss = s.split("");
//        String[] tt = t.split("");
//        Arrays.sort(ss);
//        Arrays.sort(tt);
//
//        return Arrays.equals(ss, tt);
//    }

    // todo it is a right way
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        for (int i = 0; i < t.length(); i++) {
//            System.out.print("t.charAt(i) = " + t.charAt(i) + "   ");
//            for (int j = 0; j < s.length(); j++) {
//                if (t.charAt(i) == s.charAt(j)) {
//                   s = s.replaceFirst(String.valueOf(s.charAt(j)), "");
//                   System.out.print("s = " + s + "\n");
//                   break;
//                }
//            }
//        }
//
//        return s.isEmpty();
//    }
}
