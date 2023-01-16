namespace Chapter03_Recursion;

public static class Examples
{
    public static int CalcDigits(int value)
    {
        switch (value)
        {
            case < 0:
                throw new ArgumentException("Value has to be non-negative integer.");
            case < 10:
                return 1;
            default:
            {
                var remainder = value / 10;
                return 1 + CalcDigits(remainder);
            }
        }
    }

    public static int CalcSumOfDigits(int value)
    {
        if (value == 0) return 0;

        var remainder = value / 10;
        var digit = value % 10;
        return digit + CalcSumOfDigits(remainder);
    }

    public static int GreatestCommonDivisor(int value1, int value2)
    {
        if (value2 == 0) return value1;
        var value2New = value1 % value2;
        return GreatestCommonDivisor(value2, value2New);
    }

    public static int GreatestCommonDivisorIterative(int value1, int value2)
    {
        if (value2 == 0) return value1;

        while (value2 != 0)
        {
            var value1Temp = value1;
            value1 = value2;
            value2 = value1Temp % value2;
        }

        return value1;
    }
}