package lesson04;

public class Car {
    private final double volume;
    private double remainder;
    private final double consumption100km;

    public Car(double volume, double consumption100km) {
        this.volume = volume;
        this.consumption100km = consumption100km;
        this.remainder = volume;
    }

    public double getVolume() {
        return volume;
    }


    public double getRemainder() {
        return remainder;
    }


    public double getConsumption100km() {
        return consumption100km;
    }


    public void fill() {
        double need = volume - remainder;
        remainder = volume;
        System.out.println("Бак заправлен на " + need + " литров. Бак полный.");
    }

    public double remainder(double km) {
        double cons1km = consumption100km / 100;
        double consKm = cons1km * km;
        double res = remainder - consKm;
        return res;
    }

    public double refuel(double km) {
        return volume - remainder(km);
    }
}
