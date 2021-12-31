package ch03_recursion;

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
        return fib(value-2) + fib(value-1);
    }

    public static void main(String[] args) {

    }
}
