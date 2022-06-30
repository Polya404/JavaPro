package lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

class CollectionWorkTest {

    @Test
    void toUpperCase() {
        List<String> list = List.of("one", "two");
        Pair p = new Pair("one");
        List<Pair> exp = new ArrayList<>();
        exp.add(p);
        List<Pair> res = CollectionWork.toUpperCase(list);
        Assertions.assertNotSame(exp,res);
    }

    @Test
    void meanValue() {
        List<Integer> list = List.of(1,2,3,4,5);
        CollectionWork.meanValue(list);
        double value = CollectionWork.meanValue(list).orElse(-1);
        Assertions.assertEquals(3,value);
    }

    @Test
    void sortLowerCase() {
        CollectionWork.sortLowerCase(GenerateCollection.collection());
        Assertions.assertTrue(true);
    }

}