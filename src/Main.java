import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        boolean matched = isValidPassword("Stanislav_20212");
//        System.out.println(matched);
        StringBuilder columnName = new StringBuilder();
        int columnNumber = 25;
        int rem = columnNumber % 26;
        columnName.append((char)((rem - 1) + 'A'));
        columnNumber = columnNumber / 26;
//        System.out.println(columnName.reverse());
        System.out.println((char)((25 - 1) + 'A'));

    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }

//        String pattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[~!@#$%^*()_])[a-zA-Z\\d~!@#$%^*()_]+$";
        String pattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&])[a-zA-Z\\d@$!%*?&]+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(password);
        return m.matches();
    }
}