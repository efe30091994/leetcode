package hackerrank.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class BirthDayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(4, 4, 1, 3);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int candle : candles) {
            treeMap.computeIfPresent(candle, (k, v) -> v + 1);
            treeMap.putIfAbsent(candle, 1);
        }
        Integer lastKey = treeMap.lastKey();
        return treeMap.get(lastKey);
    }
}
