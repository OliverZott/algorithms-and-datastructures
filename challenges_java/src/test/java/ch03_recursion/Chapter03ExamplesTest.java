package ch03_recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static ch03_recursion.Chapter03Examples.calcFibonacciNumber;
import static ch03_recursion.Chapter03Examples.calcFibonacciNumberIterative;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chapter03ExamplesTest {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "8, 21"})
    public void CalcFibonacciNumber_CorrectInput_RespectiveOutput(int value, int expected) {
        var result = calcFibonacciNumber(value);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 1", "3, 2", "8, 21", "517 , 497880373953008128101310739865699088316199429139329072639731816100301319690449020710377940634148387209607097"})
    public void calcFibonacciNumberIterativeTestsCorrectInputTestRespectiveOutput(int value, BigInteger expected) {
        var result = calcFibonacciNumberIterative(value);

        assertEquals(expected, result);
    }
}
