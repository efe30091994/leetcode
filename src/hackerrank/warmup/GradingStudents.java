package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade % 5 == 0) {
                result.add(grade);
            } else {
                int i = 5 - grade % 5;
                System.out.println(i);
                int rounded = grade + i;
                if (i < 3 && rounded > 39) {
                    result.add(rounded);
                } else {
                    result.add(grade);
                }
            }
        }
        return result;
    }
}
