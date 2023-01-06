using BenchmarkDotNet.Running;

namespace Chapter03_Recursion;

public static class Program
{
    public static void Main()
    {
        // Console.WriteLine(IntroductionExamples.Factorial(9));

        BenchmarkRunner.Run<IntroductionExamplesBenchmarks>();
    }
}