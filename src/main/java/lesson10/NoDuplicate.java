package lesson10;


import java.util.*;

public class NoDuplicate {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
