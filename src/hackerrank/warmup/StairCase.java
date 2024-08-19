package hackerrank.warmup;

public class StairCase {
    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }

    public static void staircase(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i < n - j ? " " : "#");
            }
            System.out.println();
        }
    }
}
