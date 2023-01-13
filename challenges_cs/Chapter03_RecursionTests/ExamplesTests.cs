using Chapter03_Recursion;

namespace Chapter03_RecursionTests;

public class ExamplesTests
{
    [Fact]
    public void CalcDigits()
    {
        Assert.Equal(6, Examples.CalcDigits(123));
        Assert.Equal(6, Examples.CalcDigits(123));
    }
}