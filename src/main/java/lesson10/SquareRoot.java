package lesson10;

public class SquareRoot {
    public static boolean root(double a, double b, double c){
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Only one root: x = " + x);
        }
        else {
            System.out.println("Have not roots");
        }
        return  true;
    }
}
