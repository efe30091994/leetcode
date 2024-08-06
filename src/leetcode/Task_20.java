package leetcode;

import java.util.ArrayDeque;

public class Task_20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "()";
        String s2 = "(]{}";
        String s3 = "]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                arrayDeque.push(bracket);
                continue;
            }

            if (arrayDeque.isEmpty()) {
                return false;
            }

            char check;
            check = arrayDeque.pop();
            if (bracket == ')' && check != '(' || bracket == ']' && check != '[' || bracket == '}' && check != '{') {
                return false;
            }
        }
        return arrayDeque.isEmpty();
    }
}
