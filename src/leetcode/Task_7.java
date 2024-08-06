package leetcode;

public class Task_7 {
    public static void main(String[] args) {
        int x = 123;
        int x1 = -123;
        int x2 = 1534236469;
        System.out.println(reverse(x2));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            result = result*10 + x%10;

            if (result > Integer.MAX_VALUE - 1 || result < Integer.MIN_VALUE + 1){
                return 0;
            }
            x /= 10;
        }

        return result;
    }

//    public static int reverse(int x) {
//        long result = 0;
//        long z = x;
//        while (z != 0){
//            result = result*10 + z%10;
//            z = z/10;
//        }
//
//        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
//            return 0;
//        }
//        return (int)result;
//    }
}
