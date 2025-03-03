package leetcode.top_interview_questions.easy.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 6, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i]) && !hashMap.get(target - nums[i]).equals(i)) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
        }
        return null;
    }
}
