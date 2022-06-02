package lesson04;

public class Main1 {
    static final double ODESSA_TO_KRIVOE_OZERO = 178;
    static final double KRIVOE_OZERO_TO_ZHASHKOW = 152.8;
    static final double ZHASHKOW_TO_KIEV = 148.2;


    public static void main(String[] args) {
        double fuelCost = Double.parseDouble(args[0]);
        double allFuelNeeded = 0;
        Car car = new Car(60, 8);
        allFuelNeeded = car.getVolume() - car.remainder(ODESSA_TO_KRIVOE_OZERO) + car.getVolume() -
                car.remainder(KRIVOE_OZERO_TO_ZHASHKOW) + car.getVolume() - car.remainder(ZHASHKOW_TO_KIEV);
        System.out.println(allFuelNeeded + " надо всего топлива и его стоимость " + fuelCost * allFuelNeeded +
                " если маршрут у нас Одесса - Киев");
        System.out.println(fuelCost * allFuelNeeded + " будет стоить полная поездка");
        System.out.println("остаток топлива в пункте назначения " + car.refuel(ODESSA_TO_KRIVOE_OZERO + KRIVOE_OZERO_TO_ZHASHKOW + ZHASHKOW_TO_KIEV));
    }
}
