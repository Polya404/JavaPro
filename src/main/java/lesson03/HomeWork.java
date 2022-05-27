package lesson03;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {

    public static void numbers() {
        System.out.println("При помощи цикла for вывести " +
                "на экран нечетные числа от 1 до 99.");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void factorial(int n) {
        System.out.println("Дано число n при помощи цикла for посчитать факториал n!");
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    public static void task1while(int n) {
        System.out.println("Перепишите программы (1 и 2) с использованием цикла while.");
        int number = 0;
        while (number < 100) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
            number += 1;
        }
    }

    public static void factorialWhile(int n) {
        System.out.println("Перепишите программы (1 и 2) с использованием цикла while.");
        int f = n;
        int res = 1;
        while (n != 0) {
            res *= n;
            n--;
        }
        System.out.print("Factorial " + f + " --> ");
        System.out.println(res);
    }


    public static void task1doWhile(int n) {
        System.out.println(" Перепишите программы (1 и 2) с использованием цикла do - while.");
        int number = 0;
        do {
            if (number % 2 == 1) {
                System.out.println(number);
            }
            number++;
        } while (number <= 99);
    }

    public static void factorialDoWhile(int n) {
        System.out.println(" Перепишите программы (1 и 2) с использованием цикла do - while.");
        int f = n;
        int res = 1;
        do {
            res *= n;
            n--;
        } while (n != 0);
        System.out.print("Factorial " + f + " --> ");
        System.out.println(res);
    }


    public static void pow(int x, int n) {
        System.out.println("Даны переменные x и n вычислить x^n.");
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println(res);
    }

    public static void subsequence() {
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        for (int i = 0; i < 50; i += 5) {
            System.out.println(i * -1);
        }
    }

    public static void mult(int x) {
        System.out.println("Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        for (int i = 0; i < 10; i++) {
            System.out.print(i * x + "\t");
        }
        System.out.println();
    }

    public static void arr() {
        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел.\n" +
                "         Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static int arrayMin(int[] arr) {
        System.out.println("Дан массив размерности N, найти наименьший элемент\n" +
                "          массива и вывести на консоль (массив заполнить\n" +
                "          случайными числами из диапазона 0 .. 100)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        int min = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int arrayMax(int[] arr) {
        System.out.println("В массиве из задания 9. найти наибольший элемент");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        int max = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void replace(int[] arr) {
        System.out.println("Поменять наибольший и наименьший элементы массива местами.\n" +
                "         Пример: дан массив {4, -5, 0, 6, 8}.\n" +
                "         После замены будет выглядеть {4, 8, 0, 6, -5}");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        int max = arrayMax(arr);
        int min = arrayMin(arr);
        int tmp = max;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = min;
            } else if (arr[i] == min) {
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void chess() {
        System.out.println("Вывести на экран шахматную доску 8х8 в\n" +
                "         виде 2 мерного массива (W - белые клетки , B - черные клети)");
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        for (String[] strings : chessBoard) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + strings[j] + " ");
            }
            System.out.println();
        }
    }
}

