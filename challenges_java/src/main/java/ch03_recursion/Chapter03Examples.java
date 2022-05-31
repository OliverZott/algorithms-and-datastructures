package ch03_recursion;

import java.math.BigInteger;

public class Chapter03Examples {

    public static long calcFibonacciNumber(final long value) {
        if (value < 1) {
            throw new IllegalArgumentException("Input must be greater or equal 1");
        }

        if (value == 1 || value == 2) {
            return 1;
        } else {
            return calcFibonacciNumber(value - 1) + calcFibonacciNumber(value - 2);
        }
    }

    public static BigInteger calcFibonacciNumberIterative(long value) {
        if (value < 1) {
            throw new IllegalArgumentException("Input must be greater or equal 1");
        }

        if (value == 1 || value == 2) {
            return BigInteger.valueOf(1);
        }

        BigInteger temp1 = BigInteger.valueOf(1);
        BigInteger temp2 = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(0);
        while (value > 2) {
            result = temp1.add(temp2);
            temp1 = temp2;
            temp2 = result;
            value -= 1;
        }
        return result;
    }

    /**
     * Example 3.2.2
     *
     * @param number value
     * @return Amount of digits
     */
    public static int calcDigits(final int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater zero!");
        }

        final int remainder = number / 10;

        if (number < 10) {
            return 1;
        }
        return 1 + calcDigits(remainder);
    }

    public static int calcSumOfDigits(final int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater zero!");
        }

        final int lastDigit = number % 10;
        final int remainder = number / 10;

        if (remainder == 0) {
            return number;
        }
        return lastDigit + calcSumOfDigits(remainder);
    }


    /**
     * Example 3.2.3
     *
     * @param firstValue  input
     * @param secondValue input
     * @return greatest common divisor
     */
    public static int gcd(int firstValue, int secondValue) {
//        int temp;
//        if (firstValue <= secondValue) {
//            temp = firstValue;
//            firstValue = secondValue;
//            secondValue = temp;
//        }

        if (secondValue == 0) {
            return firstValue;
        } else {
            var temp = firstValue % secondValue;
            var temp2 = secondValue % firstValue;
            return gcd(secondValue, firstValue % secondValue);
        }
    }

    public static void main(String[] args) {

        for (int i = 10; i < 2000; i++) {
            System.out.printf("%d. Fibonacci number: %d%n", i, calcFibonacciNumberIterative(i));
        }
    }
}
