package ch02_math;

import java.util.ArrayList;
import java.util.Map;

public class EX01_Basics {

    static int calcExampleBasic(int m, int n) {
        return ((n * m) / 2) % 7;
    }

    static ArrayList<Object> calcExampleStatistic(int maxValue) {
        var result = new ArrayList<>();
        var temp = new ArrayList<>();
        for (int i = 2; i < maxValue; i++) {
            if (i % 2 == 0 || i % 7 == 0) {
                temp.add(i);
            }
        }
        result.add(temp.size());
        var sum = temp.stream().mapToInt(x -> (int) x).sum();
        result.add(sum);
        return result;
    }

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }

    public static boolean isOdd(int input) {
        return input % 2 != 0;
    }

    public static String numberAsText(int number) {
        int remainingNumber = number;
        StringBuilder result = new StringBuilder();

        while (remainingNumber > 0) {
            var digit = remainingNumber % 10;
            remainingNumber = remainingNumber / 10;
            result = new StringBuilder(intToString(digit) + " " + result);
        }
        return result.toString().trim();
    }

    static Map<Integer, String> integerStringMap =
            Map.of(0, "ZERO", 1, "ONE", 2, "TWO", 3, "THREE", 4, "FOUR",
                    5, "FIVE", 6, "SIX", 7, "SEVEN", 8, "EIGHT", 9, "NINE");

    public static String intToString(int value) {
        return integerStringMap.get(value);
    }

    public static void main(String[] args) {

    }
}
