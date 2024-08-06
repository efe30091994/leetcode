package leetcode;

import java.util.HashSet;

public class Task_287 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums) {
        int result = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            if (!hashSet.add(i)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
