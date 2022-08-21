import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeworkEleven {
    public static String findOddIndexedNames(String[] names) {
        String oddIndexedNames = IntStream
                .range(0, names.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names[i])
                .collect(Collectors.joining(", "));

        return oddIndexedNames;
    }
    public static String[] returnFormattedUpperZtA(String[] lines) {
        List<String> formatted = Stream.of(lines)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder()).toList()
                ;

        return formatted.toArray(new String[formatted.size()]);
    }
    public static String numToSortedString(String[] numbers) {

        String strWithNums = String.join(", ", numbers);

        int[] intArrays= Stream.of(strWithNums.split(", "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray()
                ;

        return Arrays.toString(intArrays).replace("[", "").replace("]", "");
    }
    public static Stream<Long> randomNumsGenerator(long a, long c, long m) {

        Stream<Long> randomNums;
        long seed = 0L;
        randomNums = Stream.iterate(seed, n -> (a * n + c) % m);

        return randomNums;
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        Object[] firstArr = first.toArray();
        Object[] secondArr = second.toArray();

        ArrayList resultList = new ArrayList();

        for (int i = 0; i < firstArr.length && i < secondArr.length; i++) {
            resultList.add((T) firstArr[i]);
            resultList.add((T) secondArr[i]);
        }

        return (Stream<T>) Stream.of(resultList);
    }
}
