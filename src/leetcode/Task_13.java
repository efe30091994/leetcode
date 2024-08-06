package leetcode;

public class Task_13 {
    public static void main(String[] args) {
      String romanNumber = "MCMXCIV";
        System.out.println(romanToInt(romanNumber));
    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] romanNumbers = s.toCharArray();

        for (int i = 0; i < romanNumbers.length; i++){
            int val1 = romanVal(romanNumbers[i]);
            if (i + 1 < romanNumbers.length){
                int val2 = romanVal(romanNumbers[i+1]);
                if (val1 >= val2){
                    result += val1;
                }else {
                    result -= val1;
                }
            }else {
                result += val1;
            }


            System.out.println("result = " + result);
        }

        return result;
    }

    public static int romanVal(char romanNumber){
        if (romanNumber == 'I') {
            return  1;
        } else if (romanNumber == 'V') {
            return  5;
        } else if (romanNumber == 'X') {
            return  10;
        } else if (romanNumber == 'L') {
            return  50;
        } else if (romanNumber == 'C') {
            return  100;
        } else if (romanNumber == 'D') {
            return  500;
        } else if (romanNumber == 'M') {
            return  1000;
        }
        return 0;
    }
}
