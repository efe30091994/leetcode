package leetcode.top_interview_questions.easy.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, num);
        }
        return map.values().size() != nums.length;
    }
}
