package leetcode;

public class Task_28 {
    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";
        String s3 = "mississip";
        String s4 = "issip";
        String s5 = "a";
        String s6 = "a";
        String s7 = "abc";
        String s8 = "c";
        String s9 = "leetcode";
        String s10 = "leeto";
        System.out.println(strStr(s3, s4));
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (needle.length() > haystack.length()) return index;
        if (needle.length() == 1 && haystack.length() == 1) return 0;

        for (int i = 0; i < haystack.length(); i++) {
            int endIndex = i + needle.length();
            if (endIndex <= haystack.length()) {
                System.out.println("i = " + i);
                String part = haystack.substring(i, endIndex);
                if (part.equals(needle)) {
                    index = i;
                    break;
                }
            } else {
                return index;
            }
        }
        return index;
    }
}
