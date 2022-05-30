package lesson04;

public class Main1 {
    private static final double OdessaToKrivoeOzero = 178;
    private static final double KrivoeOzeroToZhashkow = 152.8;
    private static final double ZhashkowToKiev = 148.2;


    public static void main(String[] args) {
        double fuelCost = Double.parseDouble(args[0]);
        double allFuelNeeded = 0;
        Car car = new Car(60, 8);
        allFuelNeeded = car.getVolume() - car.remainder(OdessaToKrivoeOzero) + car.getVolume() -
                car.remainder(KrivoeOzeroToZhashkow) + car.getVolume() - car.remainder(ZhashkowToKiev);
        System.out.println(allFuelNeeded + " надо всего топлива и его стоимость " + fuelCost * allFuelNeeded +
                " если маршрут у нас Одесса - Киев");
        System.out.println(fuelCost * allFuelNeeded + " будет стоить полная поездка");
        System.out.println("остаток топлива в пункте назначения " + car.refuel(OdessaToKrivoeOzero + KrivoeOzeroToZhashkow + ZhashkowToKiev));
    }
}
