package lesson10;

import lesson08.CollectionImpl;

import java.util.function.Consumer;

public interface Iterator<String> {
    String next();

    boolean hasNext();

    void remove();

    void forEach(CollectionImpl collection);
}
