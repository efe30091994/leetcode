package leetcode;

import java.util.Arrays;

public class Task_1460 {
    public static void main(String[] args) {
        int[] target = new int[]{1,2,3,4}, arr = new int[]{2,4,1,3};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }
}
