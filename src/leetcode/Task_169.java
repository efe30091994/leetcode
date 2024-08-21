package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_169 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.computeIfPresent(num, (k, v) -> v + 1);
            hashMap.putIfAbsent(num, 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        int count = 0;
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}
