package leetcode;

import java.util.Arrays;

public class Task_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums1 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++){
            answer[i] = product;
            product = product * nums[i];
            System.out.println("answer = " + Arrays.toString(answer) + ";   product = " + product);
        }

        System.out.println("-------------------------");

        product = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            answer[i] = answer[i] * product;
            product = product * nums[i];
            System.out.println("answer = " + Arrays.toString(answer) + ";   product = " + product);
        }
        return answer;
    }
}
