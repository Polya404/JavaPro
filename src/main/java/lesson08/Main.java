package lesson08;

import lesson07.StringCollection;

public class Main {
    public static void main(String[] args) {
        CollectionImpl stringCollection = new CollectionImpl();
        CollectionImpl stringCollection2 = new CollectionImpl();

        stringCollection.add(0, "0");
        stringCollection.add(1, "1");
        stringCollection.add(2, "2");
        stringCollection.add(3, "3");
        stringCollection.add(4, "4");
        stringCollection.delete("2");
        stringCollection.add("123");
        System.out.println(stringCollection.size());
        System.out.println(stringCollection.get(2));
        stringCollection2.add(0, "0");
        stringCollection2.add(1, "1");
        stringCollection2.add("123");
        stringCollection2.add(null);
        stringCollection.add(null);
        System.out.println(stringCollection.contain("2"));
        System.out.println(stringCollection.equals(stringCollection2));
        stringCollection.add(2, "100");
        stringCollection.delete("100");
        stringCollection.add(3, null);
        stringCollection.delete(null);
        stringCollection.delete(null);

    }
}
