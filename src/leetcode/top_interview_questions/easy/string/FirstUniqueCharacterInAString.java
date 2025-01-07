package leetcode.top_interview_questions.easy.string;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }
}
