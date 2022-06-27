package lesson08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CollectionImplTest {

    @Test
    void add() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("1");
        Assertions.assertEquals(1, collection.size());
        collection.add(null);
        Assertions.assertEquals(2, collection.size());
    }

    @Test
    void testAdd() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(0,"1");
        Assertions.assertEquals(1, collection.size());
        Assertions.assertEquals("1", collection.get(0));
        collection.add(0,null);
        Assertions.assertEquals(2, collection.size());
        Assertions.assertEquals(null, collection.get(0));
        collection.add(2,"1");
        Assertions.assertEquals(3, collection.size());
        Assertions.assertEquals("1", collection.get(2));
        collection.add(0,null);
        Assertions.assertEquals(4, collection.size());
        Assertions.assertEquals(null, collection.get(0));
    }

    @Test
    void delete() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(0,"1");
        collection.add(1,"2");
        collection.add(2,"3");
        collection.add(3,"4");
        Assertions.assertEquals(4, collection.size());
        collection.delete("1");
        Assertions.assertEquals(3, collection.size());
        collection.delete("2");
        Assertions.assertEquals(2, collection.size());
        collection.delete("4");
        Assertions.assertEquals(1, collection.size());

    }

    @Test
    void get() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(1,"1");
        Assertions.assertEquals("1", collection.get(1));
        collection.add(2,"11");
        Assertions.assertEquals("11", collection.get(2));
        collection.add(3,"5");
        Assertions.assertEquals("5", collection.get(3));
        collection.add(1,null);
        Assertions.assertEquals(null, collection.get(1));
    }

    @Test
    void contain() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(0,"1");
        collection.add(1,"11");
        collection.add(2,"3");
        collection.add(3,"7");
        Assertions.assertTrue(collection.contain("11"));
        Assertions.assertTrue(collection.contain("1"));
        Assertions.assertFalse(collection.contain("45"));
    }

    @Test
    void testEquals() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(0,"1");
        collection.add(1,"11");
        collection.add(2,"3");
        collection.add(3,"7");
        collection.add(4,"3");
        collection.add(5,"7");
        Assertions.assertEquals(collection.get(3), collection.get(5));
        Assertions.assertEquals(collection.get(2), collection.get(4));
    }

    @Test
    void clear() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(1,"1");
        collection.add(2,"1");
        collection.add(3,"1");
        collection.add(1,"1");
        Assertions.assertEquals(4, collection.size());
        collection.clear();
        Assertions.assertEquals(0, collection.size());
    }

    @Test
    void size() {
        CollectionImpl collection = new CollectionImpl();
        Assertions.assertEquals(0, collection.size());
        collection.add("1");
        Assertions.assertEquals(1, collection.size());
        collection.delete("1");
        Assertions.assertEquals(0, collection.size());
    }

}