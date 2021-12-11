package ch01_intro;

import org.junit.jupiter.api.Test;


import static ch01_intro.FirstExample.stringReversal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstExampleTest {

    @Test
    public void stringReversal_CorrectInput_RespectiveOutput() {
        var result = stringReversal("Test");
        assertEquals("tseT", result);
    }

    @Test
    public void stringReversal_EmptyInput_EmptyOutput() {
        var result = stringReversal("");
        assertEquals("", result);
    }

}
