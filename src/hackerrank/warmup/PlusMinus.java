package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        double positiveNumbers = 0;
        double negativeNumbers = 0;
        double zero = 0;
        int arrSize = arr.size();
        for (int i : arr) {
            if (i > 0) {
                positiveNumbers++;
            } else if (i < 0) {
                negativeNumbers++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f %n", positiveNumbers / arrSize);
        System.out.printf("%.6f %n", negativeNumbers / arrSize);
        System.out.printf("%.6f %n", zero / arrSize);
    }
}
