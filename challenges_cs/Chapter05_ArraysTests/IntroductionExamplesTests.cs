using Chapter05_Arrays;

namespace Chapter05_ArraysTests;

public class IntroductionExamplesTests
{
    [Fact]
    public void SwapTest()
    {
        // Arrange
        var inputArray = new[] { 1, 2, 3, 4, 5, 6 };
        var expectedArray = new[] { 6, 2, 3, 4, 5, 1 };

        // Act
        var resultArray = IntroductionExamples.Swap(inputArray, 5, 0);

        //Assert
        Assert.Equal(expectedArray, resultArray);
    }

    [Fact]
    public void FindTest()
    {
        Assert.Equal(3, IntroductionExamples.FindInArray(new[] { 23, 7, 0, -42, 5, 0 }, -42));
        Assert.Equal(0, IntroductionExamples.FindInArray(new[] { "test", "key", "door", "blub" }, "test"));
        Assert.Equal(2, IntroductionExamples.FindInArray(new[] { null, "key", "door", "blub" }, "door"));
        Assert.Equal(-1, IntroductionExamples.FindInArray(new[] { "test", "key", "door", "blub" }, "Invader"));
    }

    [Fact]
    public void FindTest2()
    {
        Assert.Equal(3, IntroductionExamples.FindInArray2(new[] { 23, 7, 0, -42, 5, 0 }, -42));
        Assert.Equal(0, IntroductionExamples.FindInArray2(new[] { "test", "key", "door", "blub" }, "test"));
        Assert.Equal(2, IntroductionExamples.FindInArray2(new[] { null, "key", "door", "blub" }, "door"));
        Assert.Equal(-1, IntroductionExamples.FindInArray2(new[] { "test", "key", "door", "blub" }, "Invader"));
    }
}