package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task_128 {
    public static void main(String[] args) {
       int[] nums = {100,4,200,1,3,2}; // 1 2 3 4 100 200
       int[] nums1 = {0,3,7,2,5,8,4,6,0,1};
       int[] nums2 = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums2));
    }

    public static int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int number : nums) {
            if (!set.contains(number - 1)) {
                int length = 0;
                while (set.contains(number + length)) {
                    length++;
                }
                result = Math.max(result, length);
            }
        }

        return result;
    }
}
