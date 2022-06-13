package lesson08;

public interface Collection {
    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String o);

    String get(int index);

    boolean contain(String o);

    boolean equals (Collection str);

    boolean clear();

    int size();
}
