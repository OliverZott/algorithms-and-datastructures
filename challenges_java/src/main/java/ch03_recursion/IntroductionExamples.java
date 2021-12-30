package ch03_recursion;

public class IntroductionExamples {

    public static int factorial(int value) {
        if (value <= 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

    public static int sum(int value) {
        if (value < 1) {
            return 0;
        } else {
            return value + sum(value - 1);
        }
    }


    public static void main(String[] args) {

    }
}
