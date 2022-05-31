package ch03_recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static ch03_recursion.Chapter03Examples.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @ParameterizedTest
    @CsvSource({"7,1", "12300, 5", "42, 2"})
    public void calcDigits_ValidInput_NumberOfDigits(int value, int expected) throws IllegalArgumentException {
        var result = calcDigits(value);

        assertEquals(expected, result);
    }

    @Test
    public void calcDigits_InvalidInput_Exception() {
        Exception exception = (Exception) assertThrows(IllegalArgumentException.class, () -> calcDigits(-24));

        String expectedMessage = "Number must be greater zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @ParameterizedTest
    @CsvSource({"7, 42, 7", "42, 28, 14", "42, 14, 14"})
    public void calcGcd_correctInput_respectiveOutput(int a, int b, int expected) {
        var result = gcd(a, b);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"7, 40, 1", "42, 29, 1"})
    public void calcGcd_wrongInput_respectiveOutput(int a, int b, int expected) {
        var result = gcd(a, b);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1234, 10", "1234567, 28"})
    public void calcSumOfDigits_ValidInput_Sum(int value, int expected) throws IllegalArgumentException {
        var result = calcSumOfDigits(value);

        assertEquals(expected, result);
    }
}
