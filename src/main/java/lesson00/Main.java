package lesson00;

public class Main {
    public static void main(String[] args) {
        Distance.print();
        Distance obj = new Distance();
        System.out.println(obj.getDistance());
        obj.setDistance(345);
        Distance.print();
    }
}
