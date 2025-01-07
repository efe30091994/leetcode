package leetcode.top_interview_questions.easy.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panam";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (end > start) {
            if (s.charAt(start) != s.charAt(end)) return false;
            end--;
            start++;
        }
        return true;
    }
}
