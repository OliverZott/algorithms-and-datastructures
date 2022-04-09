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


    public static void main(String[] args) {

        for (int i = 10; i < 2000; i++) {
            System.out.printf("%d. Fibonacci number: %d%n", i, calcFibonacciNumberIterative(i));
        }
    }
}
