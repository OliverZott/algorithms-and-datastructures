using Chapter03_Recursion;

namespace Chapter03_RecursionTests;

public class IntroductionExamplesTests
{
    [Fact]
    public void Factorial_Input_CorrectResult()
    {
        // Arrange

        // Act
        var result = IntroductionExamples.Factorial(9);

        // Assert
        Assert.Equal(362880, result);
    }

    [Fact]
    public void Factorial_InvalidInput_ThrowsException()
    {
        Assert.Throws<ArgumentException>(() => IntroductionExamples.Factorial(-3));
    }

    [Fact]
    public void Factorial_InputOne_ReturnsOne()
    {
        Assert.Throws<ArgumentException>(() => IntroductionExamples.Factorial(-3));
    }
}