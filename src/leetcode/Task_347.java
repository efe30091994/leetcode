package leetcode;

import java.util.*;

public class Task_347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] nums1 = {1};
        int[] nums2 = {-1, -1};
        int[] nums3 = {1,2};
        int[] nums4 = {5,3,1,1,1,3,73,1};
        int[] nums5 = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int[] nums6 = {4,1,-1,2,-1,2,3};
        int k = 2;
        int k1 = 1;
        int k2 = 10;
        System.out.println(Arrays.toString(topKFrequent(nums6, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums){
            hashMap.computeIfPresent(num, (p, v) -> v + 1);
            hashMap.putIfAbsent(num, 1);
        }

        List<Map.Entry<Integer, Integer>> listOfEntrySet = new ArrayList<>(hashMap.entrySet());
        listOfEntrySet.sort(Collections.reverseOrder(Comparator.comparingInt(Map.Entry::getValue)));

        System.out.println("map = " + hashMap );

        for (Map.Entry<Integer, Integer> map : listOfEntrySet){
            list.add(map.getKey());
            if (list.size() == k) break;
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
