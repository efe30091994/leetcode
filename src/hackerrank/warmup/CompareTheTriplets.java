package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        System.out.println(compareTriplets(a, b));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            if (!Objects.equals(a.get(i), b.get(i)) && a.get(i) > b.get(i)) {
                alice++;
            } else if (b.get(i) > a.get(i)) {
                bob++;
            }
        }
        return Arrays.asList(alice, bob);
    }
}
