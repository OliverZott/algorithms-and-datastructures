import org.junit.jupiter.api.Test;


import static ch01_intro.example1.stringReversal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ch01_test {

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
