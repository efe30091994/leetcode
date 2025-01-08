package leetcode.top_interview_questions.easy.string;

public class StringToInteger {
    public static void main(String[] args) {
       String s1 = " ";
       String s2 = "42";
       String s3 = "-042";
       String s4 = "1337c0d3";
       String s5 = "0-1";
       String s6 = "words and 987";
        System.out.println("res: " + myAtoi(s6));
    }

    public static int myAtoi(String s) {
        int total = 0, index = 0, sign = 1;
        if (s.isEmpty()) return  0;
        while (index < s.length() && s.charAt(index) == ' ') index++;
        if (index == s.length()) return 0;
        if (s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < s.length()){
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

//    public static int myAtoi2(String s) {
//        s = s.strip();
//        if (s.isEmpty())
//            return 0;
//
//        final int sign = s.charAt(0) == '-' ? -1 : 1;
//        if (s.charAt(0) == '+' || s.charAt(0) == '-')
//            s = s.substring(1);
//
//        long num = 0;
//
//        for (final char c : s.toCharArray()) {
//            if (!Character.isDigit(c))
//                break;
//            num = num * 10 + (c - '0');
//            if (sign * num <= Integer.MIN_VALUE)
//                return Integer.MIN_VALUE;
//            if (sign * num >= Integer.MAX_VALUE)
//                return Integer.MAX_VALUE;
//        }
//
//        return sign * (int) num;
//    }
}
