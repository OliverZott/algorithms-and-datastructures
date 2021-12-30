package ch03_recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static ch03_recursion.IntroductionExamples.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroductionExamplesTests {

    @ParameterizedTest
    @CsvSource({"2, 2", "3, 6", "8, 40320", "-24, 1", "0, 1"})
    public void factorialTest(int value, int expected) {
        var result = factorial(value);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource({"2, 3", "3, 6", "-1, 0", "11, 66", "0, 0"})
    public void sumTest(int value, int expected) {
        var result = sum(value);
        assertEquals(result, expected);
    }
}
