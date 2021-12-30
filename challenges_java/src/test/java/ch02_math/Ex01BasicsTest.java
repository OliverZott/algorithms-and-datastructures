package ch02_math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static ch02_math.EX01_Basics.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex01BasicsTest {


    @ParameterizedTest(name = "CalcExample Tests")
    @CsvSource({"6, 7, 0", "-5, 5, -5"})
    public void calcExampleBasicTest(int first, int second, int expected) {
        var result = calcExampleBasic(first, second);
        assertEquals(result, expected);
    }

    @ParameterizedTest(name = "CalcExample {index}: (({0}*{1}})/2)%7 = {1}")
    @MethodSource("listInputsAndExpected")
    public void calcExampleStatisticTest(int maxValue, List<Integer> expected) {
        var result = calcExampleStatistic(maxValue);
        assertEquals(result, expected);
    }

    @ParameterizedTest(name = "Even: {index}: {0} is even}")
    @CsvSource({"2", "-6", "0"})
    public void isEvenTest(int input) {
        assertTrue(isEven(input));
    }

    @ParameterizedTest(name = "Odd: {index}: {0} is odd}")
    @CsvSource({"17", "-3", "111"})
    public void isOddTest(int input) {
        var result = isOdd(input);
        assertTrue(result);
    }

    //    @MethodSource("listInputsAndExpected2")
    //    @ParameterizedTest(name = "Number as Text {0} = {1}")
    @ParameterizedTest
    @CsvSource({"2, TWO", "2534, TWO FIVE THREE FOUR", "631, SIX THREE ONE"})
    public void numberAsTextTest(int number, String expected) {
        var result = numberAsText(number);
        assertEquals(result, expected);
    }


    private static Stream<Arguments> listInputsAndExpected() {
        return Stream.of(
                Arguments.of(3, List.of(1, 2)),
                Arguments.of(8, List.of(4, 19)),
                Arguments.of(15, List.of(8, 63))
        );
    }

//    private static Stream<Arguments> listInputsAndExpected2() {
//        return Stream.of(
//                Arguments.of(3, "THREE"),
//                Arguments.of(81, "EIGHT ONE"),
//                Arguments.of(105, "ONE ZERO FIVE")
//        );

}
