package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Task_217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums2));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return set.size() != nums.length;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> numbers = new HashMap<>();
//        int i = 0;
//        int length =  nums.length;
//        while ( i < length){
//            if (numbers.containsKey(nums[i])){
//                return true;
//            }
//            numbers.put(nums[i], i);
//
//            i ++;
//        }
//        return false;
//    }

//    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> numbers = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//            if (numbers.containsKey(nums[i])){
//                return true;
//            }
//            numbers.put(nums[i], i);
//        }
//        return false;
//    }
}
