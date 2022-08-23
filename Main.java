import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println( HomeworkEleven.findOddIndexedNames(new String[]{"Alex", "Bob", "Alexa", "Kris", "Dolla"}));

        System.out.println( Arrays.toString( HomeworkEleven.returnFormattedUpperZtA( new String[]{"dgds", "safasf", "aldlfmao", "jsbdaoab"} ) ) );

        HomeworkEleven.numToSortedString(new String[]{"1, 2, 0", "4, 5"});

        HomeworkEleven.randomNumsGenerator(25214903917L, 11L, 2^48L).limit(20).forEach(System.out::println);

        Stream res = HomeworkEleven.zip(Stream.of("sf", "sdf", "sada"), Stream.of("rtre", "ytu", "utrr", "kirby"));
        res.forEach(n -> System.out.println(n));
    }
}