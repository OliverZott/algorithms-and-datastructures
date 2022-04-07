package ch03_recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static ch03_recursion.IntroductionExamples.*;
import static org.junit.jupiter.api.Assertions.*;

public class IntroductionExamplesTests {

    @ParameterizedTest
    @CsvSource({"2, 2", "3, 6", "8, 40320", "0, 1"})
    public void factorialTest(int value, int expected) {
        var result = factorial(value);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {-12})
    public void factorialTest_invalidInput_throwsException(int value) {
        assertThrowsExactly(IllegalArgumentException.class, () -> sum(value));
    }

    @ParameterizedTest
    @CsvSource({"2, 3", "3, 6", "11, 66"})
    public void sumTest_returnsValidOutput(int value, int expected) {
        var result = sum(value);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    public void sumTest_invalidInput_throwsException(int value) {
        assertThrowsExactly(IllegalArgumentException.class, () -> sum(value));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "4, 3", "8, 21"})
    public void fib_returnsValidOutput(int value, int expected) {
        var result = fib(value);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    public void fibTest_invalidInput_throwsException(int value) {
        assertThrowsExactly(IllegalArgumentException.class, () -> sum(value));
    }


    @Test
    public void isPalindromeSimpleRecursive_correctInput_true() {
        int[] input = new int[]{1, 2, 3, 2, 1};

        var result = isPalindromeSimpleRecursive(input);

        assertTrue(result);
    }

    @Test
    public void isPalindromeRecursive_correctInput_returnTrue() {
        int[] input = new int[]{1, 2, 3, 2, 1};
        int[] input2 = new int[]{1, 2, 2, 1};

        var result = isPalindromeRecursive(input);
        var result2 = isPalindromeRecursive(input2);

        assertTrue(result);
        assertTrue(result2);
    }

    @Test
    public void isPalindromeRecursive_wrongInput_returnFalse() {
        int[] input = new int[]{1, 2, 3, 1, 2, 1};

        var result = isPalindromeRecursive(input);

        assertFalse(result);
    }

    @Test
    public void isPalindromeIterative_correctInput_returnTrue() {
        int[] input = new int[]{1, 2, 3, 2, 1};
        int[] input2 = new int[]{1, 2, 2, 1};
        int[] input3 = new int[]{17};

        var result = isPalindromeIterative(input);
        var result2 = isPalindromeIterative(input2);
        var result3 = isPalindromeIterative(input2);

        assertTrue(result);
        assertTrue(result2);
        assertTrue(result3);
    }

    @Test
    public void isPalindromeIterative_wrongInput_returnFalse() {
        int[] input = new int[]{1, 2, 3, 1, 2, 1};

        var result = isPalindromeIterative(input);

        assertFalse(result);
    }
}
