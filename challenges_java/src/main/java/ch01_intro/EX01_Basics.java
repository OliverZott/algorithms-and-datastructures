package ch01_intro;

import java.util.ArrayList;

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

    public static void main(String[] args) {

    }
}
