package lesson00;

import java.util.Scanner;

public class Distance {
    private static double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        Distance.distance = distance;
    }

    public static void print() {
        if (distance == 0) {
            distance = Converter.scanner();
        }
        System.out.println(Converter.convertToNanometer(distance));
        System.out.println(Converter.convertTokKilometers(distance));
        System.out.println(Converter.convertToMillimeters(distance));
        System.out.println(Converter.convertToCentimeters(distance));
    }


    static class Converter {
        private static final Scanner scanner = new Scanner(System.in);

        private static int scanner() {
            System.out.println("Enter distance in meters");
            return scanner.nextInt();
        }

        private static double convertToNanometer(double distance) {
            distance /= Math.pow(10, -9);
            System.out.print("nanometers ");
            return distance;
        }

        private static double convertToMillimeters(double distance) {
            distance /= Math.pow(10, -3);
            System.out.print("millimeters ");
            return distance;
        }

        private static double convertTokKilometers(double distance) {
            distance /= Math.pow(10, 3);
            System.out.print("kilometers ");
            return distance;
        }

        private static double convertToCentimeters(double distance) {
            distance /= Math.pow(10, -2);
            System.out.print("centimeters ");
            return distance;
        }
    }
}
