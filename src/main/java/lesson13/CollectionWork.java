package lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionWork {

    public static List<Pair> toUpperCase(List<String> array) {
        return array.stream().map(Pair::new).collect(Collectors.toList());
    }

    public static OptionalDouble meanValue(List<Integer> array) {
        return array.stream().mapToInt(Integer::intValue).average();
    }

    public static boolean sortLowerCase(List<String> array) {
        array.stream().filter(s -> length().test(s)).filter(s -> isLowerCase().test(s)).forEach(System.out::println);
        return true;
    }

    public static Predicate<String> isLowerCase() {
        return s -> s.equals(s.toLowerCase());
    }

    public static Predicate<String> length() {
        return s -> s.length() == 4;
    }
}
