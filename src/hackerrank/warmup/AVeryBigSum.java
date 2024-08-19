package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {
        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        System.out.println(aVeryBigSum(ar));
    }

    public static long aVeryBigSum(List<Long> ar) {
        long res = 0;
        for (Long i : ar){
            res = Long.sum(res, i);
        }
        return res;
    }
}
