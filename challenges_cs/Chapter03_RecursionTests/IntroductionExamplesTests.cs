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

    [Fact]
    public void Sum_ExpectedResults()
    {
        Assert.Equal(45, IntroductionExamples.Sum(9));
        Assert.Equal(1, 1);
        Assert.Equal(0, 0);
        Assert.Throws<ArgumentException>(() => IntroductionExamples.Sum(-23));
    }

    [Fact]
    public void Fibonacci_ExpectedResult()
    {
        Assert.Equal(0, IntroductionExamples.Fibonacci(0));
        Assert.Equal(1, IntroductionExamples.Fibonacci(1));
        Assert.Equal(1, IntroductionExamples.Fibonacci(2));
        Assert.Equal(34, IntroductionExamples.Fibonacci(9));
        Assert.Throws<ArgumentException>(() => IntroductionExamples.Fibonacci(-3));
    }

    [Fact]
    public void IsPalindrome()
    {
        Assert.True(IntroductionExamples.IsPalindrome("AbbA"));
        Assert.False(IntroductionExamples.IsPalindrome("AbcA"));
        Assert.True(IntroductionExamples.IsPalindrome("A"));
        Assert.True(IntroductionExamples.IsPalindrome("AbcbA"));
        Assert.False(IntroductionExamples.IsPalindrome("ABCDEF"));
    }

    [Fact]
    public void IsPalindromeRecursive()
    {
        Assert.True(IntroductionExamples.IsPalindromeRecursive(new[] { 1, 2, 2, 1 }));
        Assert.True(IntroductionExamples.IsPalindromeRecursive(new[] { 1, 2, 3, 2, 1 }));
        Assert.True(IntroductionExamples.IsPalindromeRecursive(new[] { 17 }));
        Assert.False(IntroductionExamples.IsPalindromeRecursive(new[] { 1, 2, 3, 4, 5 }));
        Assert.False(IntroductionExamples.IsPalindromeRecursive(new[] { 1, 2, 3, 4, 2, 1 }));
    }

    [Fact]
    public void IsPalindromeIterative()
    {
        Assert.True(IntroductionExamples.IsPalindromeIterative(new[] { 1, 2, 2, 1 }));
        Assert.True(IntroductionExamples.IsPalindromeIterative(new[] { 1, 2, 3, 2, 1 }));
        Assert.True(IntroductionExamples.IsPalindromeIterative(new[] { 17 }));
        Assert.False(IntroductionExamples.IsPalindromeIterative(new[] { 1, 2, 3, 4, 5 }));
        Assert.False(IntroductionExamples.IsPalindromeIterative(new[] { 1, 2, 3, 4, 2, 1 }));
    }
}