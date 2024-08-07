package leetcode;

public class Task_2011 {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

//    spent time 0 ms
    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            if (operation.contains("--")) {
                res -= 1;
                continue;
            }
            res += 1;
        }
        return res;
    }

//    spent time 1ms

//    public static int finalValueAfterOperations(String[] operations) {
//        int res = 0;
//        for (String operation : operations) {
//            if (operation.equals("--X") || operation.equals("X--")) {
//                res -= 1;
//                continue;
//            }
//                res += 1;
//        }
//        return res;
//    }
}
