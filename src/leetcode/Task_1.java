package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums1 = new int[]{3, 2, 4};
        int[] nums2 = new int[]{3, 3};
        int[] nums3 = new int[]{3, 2, 3};
        int[] nums4 = new int[]{2, 5, 5, 11};
        int target = 9, target1 = 6, target2 = 10;
        System.out.println(Arrays.toString(twoSum(nums4, target2)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{i, map.get(target - numbers[i])};
            }
            map.put(numbers[i], i);
        }
        return new int[2];
    }

//    public static int[] twoSum(int[] nums, int target) {
//       if (nums.length == 2){
//           return new int[]{0,1};
//       }
//       int[] indexes = new int[2];
//       for (int i = 0; i < nums.length; i++){
//           System.out.println("out");
//           for (int j = i + 1; j < nums.length; j++){
//               System.out.println("i = " + nums[i] + "  j = " + nums[j]);
//               if (nums[i] + nums[j] == target ){
//                   indexes[0] = i;
//                   indexes[1] = j;
//                   return indexes;
//               }
//           }
//       }
//        return indexes;
//    }
}
