package leetcode;

public class Task_3110 {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = "zaz";
        System.out.println(scoreOfString(s2));
    }

    public static int scoreOfString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return res;
    }
}
