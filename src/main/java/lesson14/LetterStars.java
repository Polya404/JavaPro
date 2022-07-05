package lesson14;

public class LetterStars {

    private static void fillArrFromOther(char[] distArr, int beginIndexDis, int endIndexDis, char[] source) {
        int sourcInd = 0;
        for (int i = beginIndexDis; i < endIndexDis; i++) {
            distArr[i] = source[sourcInd++];
        }
    }

    static void printPhraz(char[][][] arr, int len) {
        int count = 0;
        char[][] pole = new char[arr[0].length][arr.length * arr[0][0].length + arr[0].length];
        ;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                for (int k = 0; k < len; k++) {
                    fillArrFromOther(pole[i], k * arr[0][i].length + k, (k + 1) * arr[0][i].length + k, arr[k][i]);
                }
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
