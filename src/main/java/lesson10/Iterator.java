package lesson10;

import lesson08.CollectionImpl;

public interface Iterator<String> {
    String next();

    boolean hasNext();

    void remove();

    void forEach(CollectionImpl collection);
}
