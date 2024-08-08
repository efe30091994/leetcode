package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2788 {
    public static void main(String[] args) {
//        List<String> str = Arrays.asList("$easy$", "$problem$");
//        List<String> str = Arrays.asList("|||");
        List<String> str = Arrays.asList("one.two.three", "four.five", "six");
        System.out.println(splitWordsBySeparator(str, '.'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != separator) {
                    stringBuilder.append(chars[i]);
                    if (i == chars.length - 1) {
                        result.add(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                } else {
                    if (stringBuilder.isEmpty()) {
                        continue;
                    }
                    result.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
            stringBuilder.setLength(0);
        }

        return result;
    }
}
