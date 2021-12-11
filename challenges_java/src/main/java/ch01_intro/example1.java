package ch01_intro;

public class example1 {

    public static String stringReversal(String input) {
        return input.length() <= 1 ? input : stringReversal(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        var result = stringReversal("Lenchen");
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("ExecutionTime: %d ms / Result: %s%n", elapsedTime/1000000, result);


    }
}
