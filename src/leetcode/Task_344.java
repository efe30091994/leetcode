package leetcode;

import java.util.Arrays;

public class Task_344 {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int end = s.length - 1;
        int begin = 0;
        while (end > begin) {
            char temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            begin++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
}
