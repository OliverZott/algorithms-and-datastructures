using BenchmarkDotNet.Attributes;
using BenchmarkDotNet.Order;

namespace Chapter03_Recursion;

[MemoryDiagnoser]
[Orderer(SummaryOrderPolicy.FastestToSlowest)]
[RankColumn]
public class IntroductionExamplesBenchmarks
{
    [Benchmark]
    public void Factorial()
    {
        IntroductionExamples.Factorial(22);
    }
}