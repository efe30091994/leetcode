package leetcode;

public class Task_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }

    public static String convertToTitle(int columnNumber) {
//        in ASCII A is in 65 place
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber --;
            if (columnNumber % 26 == 0) {
                result.append("A");
            } else {
                result.append((char) (columnNumber % 26 + 'A'));
            }
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
