namespace Chapter03_Recursion;

public static class IntroductionExamples
{
    public static int Factorial(int value)
    {
        return value switch
        {
            < 0 => throw new ArgumentException("Value must be non-negative."),
            0 or 1 => 1,
            _ => value * Factorial(value - 1)
        };
    }
}