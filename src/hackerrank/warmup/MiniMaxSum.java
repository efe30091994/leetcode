package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(arr2);
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> sums = new ArrayList<>();
        long i = 0;
        for (Integer x : arr) {
            i += x;
        }
        for (Integer x : arr) {
            sums.add(i - x);
        }
        Collections.sort(sums);
        System.out.println(sums.get(0) + " " + sums.get(arr.size() - 1));
    }
}
