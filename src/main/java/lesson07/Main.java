package lesson07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();

        stringCollection.add(0,"0");
        stringCollection.add(1,"1");
        stringCollection.add(2,"2");
        stringCollection.add(3,"3");
        stringCollection.add(1,"1");
        stringCollection.add("123");
        stringCollection.printArray();
        stringCollection.delete("2");
        stringCollection.printArray();
        System.out.println(stringCollection.get(2));
        stringCollection.delete(0);
        stringCollection.printArray();

    }
}
