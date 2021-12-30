package ch02_math;

import java.util.ArrayList;
import java.util.List;

public class IntroductionExamples {

    static void extractDigits(final int startValue) {
        int remainingValue = startValue;
        while (remainingValue > 0) {
            final int digit = remainingValue % 10;
            System.out.print(digit + " ");

            remainingValue = remainingValue / 10;
        }
        System.out.println();
    }

    static void countDigits(final int startValue) {
        int digitCount = 0;
        int remainingValue = startValue;
        while (remainingValue > 0) {
            remainingValue = remainingValue / 10;
            digitCount++;
        }
        System.out.println(digitCount);
    }

    static List<Integer> findProperDivisors(int startValue) {
        int maxDivisor = startValue / 2;
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= maxDivisor; i++) {
            if (startValue % i == 0) {
                divisors.add(i);
            }
        }
        divisors.forEach(System.out::println);
        return divisors;
    }

    static boolean isPrime(int potentialPrime) {
        for (int i = 2; i <= potentialPrime / 2; i++) {
            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        extractDigits(257);
//        countDigits(12611);
        findProperDivisors(21);
        findProperDivisors(17);
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
        System.out.printf("Is %d prime: %b", 18, isPrime(18));
    }
}
