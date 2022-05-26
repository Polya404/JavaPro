package lesson03;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void numbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    public static void task12while(int n) {
        int f = n;
        int number = 0;
        int res = 1;
        while (number < 100) {
            System.out.println(number);
            number += 1;
        }

        while (n != 0) {
            res *= n;
            n--;
        }
        System.out.print("Factorial " + f + " --> ");
        System.out.println(res);
    }

    public static void task12doWhile(int n) {
        int f = n;
        int number = 0;
        int res = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 99);

        do {
            res *= n;
            n--;
        } while (n != 0);
        System.out.print("Factorial " + f + " --> ");
        System.out.println(res);
    }

    public static void pow(int x, int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println(res);
    }

    public static void subsequence() {
        for (int i = 0; i < 50; i += 5) {
            System.out.println(i * -1);
        }
    }

    public static void mult(int x) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i * x + "\t");
        }
        System.out.println();
    }

    public static void arr() {
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
