package lesson09;

public class Main {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();
        CollectionImpl collection2 = new CollectionImpl();
        collection.add("Str1");
        collection.add("Str2");
        collection.add("Str3");
        collection.add("Str4");
        collection.add("Str5");
        collection.add("Str6");
        collection.add("Str7");
        collection.add("Str8");
        collection2.add("Str5");
        collection2.add("Str6");
        collection2.add("Str7");
        collection2.add("Str8");
        System.out.println(collection.get(3));
        System.out.println(collection.size());
        collection.delete("Str6");
        System.out.println(collection.contains("Str2"));
        collection.addAll(collection2);

    }
}
