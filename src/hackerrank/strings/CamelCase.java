package hackerrank.strings;

public class CamelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }

    public static int camelcase(String s) {
        return s.split("(?=[A-Z])").length;
    }
}
