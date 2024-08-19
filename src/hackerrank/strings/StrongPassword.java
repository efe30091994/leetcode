package hackerrank.strings;

public class StrongPassword {
    public static void main(String[] args) {
        int n = 11;
//        int n = 3;
//        String password = "Ab1";
        String password = "#HackerRank";
        System.out.println(minimumNumber(n, password));
    }

    public static int minimumNumber(int n, String password) {
        int charCount = 0;
        if (!password.matches(".*[a-z]{1,}.*"))
            charCount++;
        if (!password.matches(".*[A-Z]{1,}.*"))
            charCount++;
        if (!password.matches(".*[0-9]{1,}.*"))
            charCount++;
        if (!password.matches(".*[!@#$%^&*()\\-+ ]{1,}.*"))
            charCount++;
        int lengthDifference = 6 - password.length();
        if (lengthDifference > 0 && lengthDifference >= charCount) {
            return lengthDifference;
        } else {
            return charCount;
        }
    }
}
