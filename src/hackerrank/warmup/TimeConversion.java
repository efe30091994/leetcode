package hackerrank.warmup;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:01:00AM";
        String s2 = "07:01:00PM";
        System.out.println(timeConversion(s2));
    }

    public static String timeConversion(String s) {
        String[] time = s.split(":");
        if (s.contains("PM") && Integer.parseInt(time[0]) < 12) {
            time[0] = String.valueOf(Integer.parseInt(time[0]) + 12);
        } else if (s.contains("AM")) {
            if (time[0].equals("12")) {
                time[0] = "00";
            }
        }
        return String.join(":", time).replaceAll("[^0-9:]", "");
    }
}
