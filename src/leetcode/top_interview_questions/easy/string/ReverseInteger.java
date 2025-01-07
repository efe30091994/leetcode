package leetcode.top_interview_questions.easy.string;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long input = x;
        long res = 0;
        while (input != 0) {
            res = res * 10 + input % 10;
            input /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return (int) res;
    }
}
