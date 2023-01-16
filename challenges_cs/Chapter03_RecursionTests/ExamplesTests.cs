using Chapter03_Recursion;

namespace Chapter03_RecursionTests;

public class ExamplesTests
{
    [Fact]
    public void CalcSumOfDigitsTest()
    {
        Assert.Equal(6, Examples.CalcSumOfDigits(123));
        Assert.Equal(6, Examples.CalcSumOfDigits(123));
    }

    [Fact]
    public void CalDigitsTest()
    {
        Assert.Throws<ArgumentException>(() => Examples.CalcDigits(-2));
        Assert.Equal(1, Examples.CalcDigits(0));
        Assert.Equal(1, Examples.CalcDigits(9));
        Assert.Equal(6, Examples.CalcDigits(235808));
    }

    [Fact]
    public void GreatestCommonDivisorTest()
    {
        Assert.Equal(7, Examples.GreatestCommonDivisor(42, 7));
        Assert.Equal(1, Examples.GreatestCommonDivisor(17, 2));
        Assert.Equal(7, Examples.GreatestCommonDivisor(7, 42));
        Assert.Equal(14, Examples.GreatestCommonDivisor(42, 28));
        Assert.Equal(14, Examples.GreatestCommonDivisor(42, 14));
    }

    [Fact]
    public void GreatestCommonDivisorIterativeTest()
    {
        Assert.Equal(7, Examples.GreatestCommonDivisorIterative(42, 7));
        Assert.Equal(1, Examples.GreatestCommonDivisorIterative(17, 2));
        Assert.Equal(7, Examples.GreatestCommonDivisorIterative(7, 42));
        Assert.Equal(14, Examples.GreatestCommonDivisorIterative(42, 28));
        Assert.Equal(14, Examples.GreatestCommonDivisorIterative(42, 14));
    }
}