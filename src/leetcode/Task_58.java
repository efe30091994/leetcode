package leetcode;

import java.util.Arrays;

public class Task_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "   fly me   to   the moon";
        String s3 = "q";
        String s4 = "hello";
        String s5 = "b   a    ";
        System.out.println(lengthOfLastWord(s1));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

//    public static int lengthOfLastWord(String s) {
//        int length = s.length();
//        int i = length;
//        while (i > 0){
//            if(i < s.length() - 1 && s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
//                break;
//            }
//            if (s.charAt(i - 1) == ' '){
//                length --;
//            }
//            i--;
//        }
//        return length - i;
//    }

//    public static int lengthOfLastWord(String s) {
//        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));
//        return words[words.length - 1].length();
//    }

    // todo : it is a right way
//    public static int lengthOfLastWord(String s) {
//        if (s.length() == 1) return 1;
//        char[] chars = s.toCharArray();
//        int length = 0;
//        int index = 0;
//        int emptyPlace = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (i < chars.length - 1 && chars[i] == ' ' && chars[i + 1] != ' ') {
//                index = i + 1;
//                emptyPlace = 0;
//            } else if (chars[i] == ' ') {
//                emptyPlace++;
//            }
//
//            if (i == chars.length - 1) {
//                length = chars.length - index - emptyPlace;
//            }
//        }
//        return length;
//    }
}
