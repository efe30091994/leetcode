package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Task_2965 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3}, {2, 2}};
        int[][] grid3 = new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};

        int[] missingAndRepeatedValues = findMissingAndRepeatedValues(grid);
        System.out.println("missingAndRepeatedValues : " + Arrays.toString(missingAndRepeatedValues));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0;
        int missed = 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int[] array : grid) {
            for (int num : array) {
                boolean isAdded = treeSet.add(num);
                if (!isAdded) {
                    repeated = num;
                }
            }
        }

        return new int[]{repeated, missed};
    }
}
