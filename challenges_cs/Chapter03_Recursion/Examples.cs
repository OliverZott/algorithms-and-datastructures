namespace Chapter03_Recursion;

public static class Examples
{
    public static int CalcDigits(int value)
    {
        if (value == 0) return 0;

        var remainder = value / 10;
        var digit = value % 10;
        return digit + CalcDigits(remainder);
    }
}