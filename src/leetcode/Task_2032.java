package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Task_2032 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> resultList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());

        for (int num : set1) {
            hashMap.computeIfPresent(num, (k, v) -> v + 1);
            hashMap.putIfAbsent(num, 1);
        }
        for (int num : set2) {
            hashMap.computeIfPresent(num, (k, v) -> v + 1);
            hashMap.putIfAbsent(num, 1);
        }
        for (int num : set3) {
            hashMap.computeIfPresent(num, (k, v) -> v + 1);
            hashMap.putIfAbsent(num, 1);
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 1) {
                resultList.add(map.getKey());
            }
        }

        return resultList;
    }
}
