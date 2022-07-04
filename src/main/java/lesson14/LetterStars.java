package lesson14;

public class LetterStars {

    private static void fillArrFromOther(char[] distArr, int beginIndexDis, int endIndexDis, char[] source) {
        int sourcInd = 0;
        for (int i = beginIndexDis; i < endIndexDis; i++) {
            distArr[i] = source[sourcInd++];
        }
    }

    static void printPhraz(char[][][] arr) {
        int count = 0;
        char[][] pole = new char[arr[0].length][arr.length * arr[0][0].length + 4];;
        for (int j = 0; j < arr.length; j ++){
            for (int i = 0; i < arr[0].length; i++) {
                fillArrFromOther(pole[i], count, arr[0][i].length + count, arr[count][i]);
                count++;
                fillArrFromOther(pole[i], count * arr[0][i].length + count, 2 * arr[0][i].length + count, arr[count][i]);
                count++;
                fillArrFromOther(pole[i], count * arr[0][i].length + count, 3 * arr[0][i].length + count, arr[count][i]);
                count++;
                fillArrFromOther(pole[i], count * arr[0][i].length + count, 4 * arr[0][i].length + count, arr[count][i]);
//                count++;
//                fillArrFromOther(pole[i], count * arr[0][i].length + count, 5 * arr[0][i].length + count, arr[count][i]);
//                count++;
//                fillArrFromOther(pole[i], count * arr[0][i].length + count, 6 * arr[0][i].length + count, arr[count][i]);
                count = 0;
            }
        }
        for (char[] row : pole) {
            for (char elem : row) {
                if (elem == ' ' | elem == '\u0000')
                    System.out.printf("%2c", ' ');
                else
                    System.out.printf("%2c", '@');
            }
            System.out.println();
        }
    }

}
