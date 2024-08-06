package leetcode;

public class Task_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = ".,";
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        String stringWithoutEmpty = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (stringWithoutEmpty.equals(" ") || stringWithoutEmpty.isEmpty()){
            return true;
        }
        char[] strChar = stringWithoutEmpty.toCharArray();
        boolean isPalindrome = false;
        for (int i = 0; i < strChar.length; i++){
           isPalindrome =  strChar[i] == strChar[strChar.length - 1 - i];
           if (!isPalindrome){
               break;
           }
        }
        return isPalindrome;
    }
}
