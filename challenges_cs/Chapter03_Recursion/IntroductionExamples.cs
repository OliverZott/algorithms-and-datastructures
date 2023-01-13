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

    public static int Sum(int value)
    {
        return value switch
        {
            < 0 => throw new ArgumentException("Value must be non-negative."),
            1 => 1,
            _ => value + Sum(value - 1)
        };
    }

    public static int Fibonacci(int input)
    {
        return input switch
        {
            < 0 => throw new ArgumentException("Value must be non-negative."),
            0 => 0,
            1 => 1,
            _ => Fibonacci(input - 2) + Fibonacci(input - 1)
        };
    }

    public static bool IsPalindrome(string input)
    {
        input = input.ToLower();

        if (input.Length <= 1)
        {
            return true;
        }
        else if (input[0] == input[^1])
        {
            var substring = input.Substring(1, input.Length - 2);
            return IsPalindrome(substring);
        }

        return false;
    }

    public static bool IsPalindromeRecursive(int[] value)
    {
        return IsPalindromeRecursive(value, 0, value.Length - 1);
    }

    private static bool IsPalindromeRecursive(int[] value, int left, int right)
    {
        if (left >= right) return true;

        if (value[left] != value[right]) return false;
        left++;
        right--;
        return IsPalindromeRecursive(value, left, right);
    }

    public static bool IsPalindromeIterative(int[] value)
    {
        var left = 0;
        var right = value.Length - 1;

        while (left < right)
        {
            if (value[left] != value[right]) return false;

            left++;
            right--;
        }

        return true;
    }
}