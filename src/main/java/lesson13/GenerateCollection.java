package lesson13;

import java.util.ArrayList;
import java.util.List;

public class GenerateCollection {
    public static List<String> collection() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("Two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("Six");
        arrayList.add("seven");
        return arrayList;
    }
    public static List<Integer> collectionInt(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(4);
        return arrayList;
    }
}
