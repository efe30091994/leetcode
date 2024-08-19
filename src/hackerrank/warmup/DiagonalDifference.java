package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1, 2, 3);
        List<Integer> a2 = Arrays.asList(4, 5, 6);
        List<Integer> a3 = Arrays.asList(9, 8, 9);
        List<List<Integer>> arr = Arrays.asList(a1, a2, a3);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            res1 += arr.get(i).get(i);
            res2 += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(res1 - res2);
    }
}
