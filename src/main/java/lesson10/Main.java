package lesson10;

import lesson08.CollectionImpl;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("1");
        stringCollection.add("1");
        stringCollection.add("3");
        stringCollection.add("5");
        stringCollection.add("3");
        stringCollection.add("2");
        stringCollection.add("5");
        stringCollection.add("6");
        stringCollection.add("7");
        stringCollection.add("8");
        System.out.println(NoDuplicate.removeDuplicates(stringCollection));
        System.out.println(SquareRoot.root(2.0, 5.0, 6.0));
        CollectionImpl stringCollection2 = new CollectionImpl();
        stringCollection2.add(0, "0");
        stringCollection2.add(1, "1");
        stringCollection2.add(2, "2");
        stringCollection2.add(3, "3");
        stringCollection2.add(4, "4");
        stringCollection2.iterator().remove();
        System.out.println(stringCollection2.iterator().next());
        stringCollection2.iterator().remove();
        System.out.println(stringCollection2.contain("1"));
        System.out.println(stringCollection2.iterator().hasNext());
        stringCollection2.iterator().forEach(stringCollection2);
    }
}
