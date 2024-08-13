package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task_2404 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 4, 4, 1};
        System.out.println(mostFrequentEven(nums));
    }
    public static int mostFrequentEven(int[] nums) {
        int ans = -1;
        Map<Integer, Integer> count = new HashMap<>();

        for (final int num : nums) {
            if (num % 2 == 1)
                continue;
            final int newCount = count.merge(num, 1, Integer::sum);
            final int maxCount = count.getOrDefault(ans, 0);
            if (newCount > maxCount || newCount == maxCount && num < ans)
                ans = num;
        }

        return ans;
    }
}
