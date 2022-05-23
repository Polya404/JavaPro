package lesson01;

public class ArithmeticMean {
    public static void main(String[] args) {
        System.out.println(arithmeticMean(2,5));
        int[] numbers = new int[] {2,4,0,7,6,45};
        System.out.println(arithmeticMean(numbers));
    }

    public static double arithmeticMean(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double arithmeticMean(int[] numbers){
        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
