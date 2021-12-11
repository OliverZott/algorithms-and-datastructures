package ch01_intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static ch01_intro.EX01_Basics.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex01BasicsTest {


    @ParameterizedTest(name = "CalcExample {index}: (({1}*{2})/2)%7 = {3}")
    @CsvSource({"6, 7, 0", "-5, 5, -5"})
    public void calcExampleBasicTest(int first, int second, int expected) {
        var result = calcExampleBasic(first, second);
        assertEquals(result, expected);
    }

    @ParameterizedTest(name = "CalcExample {index}: (({1}*{2})/2)%7 = {3}")
    @MethodSource("listInputsAndExpected")
    public void calcExampleStatisticTest(int maxValue, List<Integer> expected) {
        var result = calcExampleStatistic(maxValue);
        assertEquals(result, expected);
    }

    @ParameterizedTest(name = "Even: {index}: {1} is even}")
    @CsvSource({"2", "-6", "0"})
    public void isEvenTest(int input) {
        assertTrue(isEven(input));
    }

    @ParameterizedTest(name = "Odd: {index}: {1} is odd}")
    @CsvSource({"17", "-3", "111"})
    public void isOddTest(int input) {
        var result = isOdd(input);
        assertTrue(result);
    }


    private static Stream<Arguments> listInputsAndExpected() {
        return Stream.of(
                Arguments.of(3, List.of(1, 2)),
                Arguments.of(8, List.of(4, 19)),
                Arguments.of(15, List.of(8, 63))
        );
    }
}
