package ch03_recursion;

import java.awt.*;
import java.util.Arrays;

public class IntroductionExamples {

    public static int factorial(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must non-negative.");
        }
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }

    public static int sum(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must non-negative.");
        }
        if (value == 1) {
            return 1;
        }
        return value + sum(value - 1);
    }

    public static int fib(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("Value must be greater 0");
        }
        if (value == 1 || value == 2) {
            return 1;
        }
        return fib(value - 2) + fib(value - 1);
    }

    public static boolean isPalindromeSimpleRecursive(int[] input) {
        if (input.length <= 1) {
            return true;
        }

        int left = 0;
        int right = input.length - 1;
        if (input[left] == input[right]) {
            final int[] reminder = Arrays.copyOfRange(input, left + 1, right);
            return isPalindromeSimpleRecursive(reminder);
        }
        return false;
    }

    public static boolean isPalindromeRecursive(int[] input) {
        return isPalindromeRecursive(input, 0, input.length - 1);
    }

    public static boolean isPalindromeRecursive(int[] input, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (input[left] == input[right]) {
            left += 1;
            right -= 1;
            return isPalindromeRecursive(input, left, right);
        }

        return false;
    }

    public static boolean isPalindromeIterative(int[] input) {
        int left = 0;
        int right = input.length - 1;
        boolean sameValue = true;

        while (left < right && sameValue) {
            left += 1;
            right -= 1;
            sameValue = input[left] == input[right];
        }
        return sameValue;
    }

    public static void fractalGenerator(final int n) {
        if (n < 1) {
            return;
        }

        if (n == 1) {
            System.out.println("-");
        } else {
            fractalGenerator(n - 1);
            System.out.println("=".repeat(n));
            fractalGenerator(n - 1);
        }
    }

    public static int multiplyAllDigits(final int value) {

        var lastDigit = value % 10;
        var remainder = value / 10;
        System.out.printf("Multiply digits: %-10d | remainder: %d, digit: %d%n", value, remainder, lastDigit);

        if (remainder > 0) {
            var result = multiplyAllDigits(remainder);
            System.out.printf("-> %d * %d = %d%n", result, lastDigit, result * lastDigit);
            return result * lastDigit;
        }
        return value;
    }


    public static void main(String[] args) {
        fractalGenerator(3);
    }
}
