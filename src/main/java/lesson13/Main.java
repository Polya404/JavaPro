package lesson13;

public class Main {
    public static void main(String[] args) {
        System.out.println(CollectionWork.toUpperCase(GenerateCollection.collection()));
        System.out.println(CollectionWork.meanValue(GenerateCollection.collectionInt()));
        CollectionWork.sortLowerCase(GenerateCollection.collection());
    }
}
