package leetcode;

import java.util.Arrays;

public class Task_167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] numbers1 = {2,3,4};
        int[] numbers2 = {-1,0};
        int target = 9;
        int target1 = 6;
        int target2 = -1;
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }else if (numbers[i] + numbers[j] < target){
                i++;
            }else {
                j--;
            }
        }

        return res;
    }
}
