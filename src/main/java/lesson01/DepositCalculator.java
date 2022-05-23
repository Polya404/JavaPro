package lesson01;

public class DepositCalculator {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]);
        double percent = Double.parseDouble(args[1]);
        int duration = Integer.parseInt(args[2]);
        double res = sum * Math.pow((1 + percent/100), (12*duration));
        System.out.println(res);
    }
}
