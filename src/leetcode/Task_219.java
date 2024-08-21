package leetcode;

import java.util.HashMap;

public class Task_219 {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 1};
        int[] nums = new int[]{1, 0, 1, 1};
//        int k = 3;
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        boolean res = false;
        int diff;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                diff = i - hashMap.get(nums[i]);
                hashMap.merge(nums[i], i, (oldValue, newValue) -> newValue);
                res = diff <= k;
                if (res) break;
            }
            hashMap.putIfAbsent(nums[i], i);
        }
        return res;
    }
}
