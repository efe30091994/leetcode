package leetcode.top_interview_questions.easy.string;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "sdbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.startsWith(needle, i)) return i;
            }
        }

        return -1;
    }
}
