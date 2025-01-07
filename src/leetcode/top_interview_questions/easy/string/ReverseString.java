package leetcode.top_interview_questions.easy.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] in = new char[]{'h','e','l','l','o'};
        reverseString(in);
    }

    public static void reverseString(char[] s) {
        int i = s.length;
        int start = 0;
        char temp;
        while (i > start){
            temp = s[start];
            s[start] = s[i - 1];
            s[i-1] = temp;
            start++;
            i--;
        }
        System.out.println("res = " + Arrays.toString(s));
    }
}
