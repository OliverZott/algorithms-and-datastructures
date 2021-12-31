package ch03_recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static ch03_recursion.IntroductionExamples.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

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
}
