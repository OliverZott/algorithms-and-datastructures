namespace Chapter05_Arrays;

public class IntroductionExamples
{
    public static void PrintArray(int[] array)
    {
        //array.ToList().ForEach(Console.WriteLine);
        foreach (var item in array)
        {
            Console.WriteLine(item);
        }
    }

    public static int[] Swap(int[] array, int firstIndex, int secondIndex)
    {
        var tempFirst = array[firstIndex];
        var tempSecond = array[secondIndex];

        array[firstIndex] = tempSecond;
        array[secondIndex] = tempFirst;
        return array;
    }


    public static int FindInArray<T>(IList<T> array, T value)
    {
        for (var i = 0; i < array.Count; i++)
        {
            if (array[i] == null) continue;
            if (array[i]!.Equals(value))
            {
                return i;
            }
        }
        return -1;
    }

    public static int FindInArray2<T>(IList<T> array, T value)
    {
        var pos = 0;
        while (pos < array.Count && !(bool)array[pos]?.Equals(value))
        {
            pos++;
        }
        return pos >= array.Count ? -1 : pos;
    }


}
