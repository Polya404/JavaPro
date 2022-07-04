package lesson14;

import java.util.HashMap;
import java.util.Map;

import static lesson14.LetterStars.printPhraz;

public class NumberPrint {
    public static void main(String[] args) {
        HashMap<String, char[][]> nums = new HashMap<>();
        for (String arg : args) {
            switch (arg) {
                case "0":
                    break;
                case "1":
                    nums.put(arg, Numbers.one);
                    break;
                case "2":
                    nums.put(arg, Numbers.two);
                    break;
                case "3":
                    nums.put(arg, Numbers.three);
                    break;
                case "4":
                    nums.put(arg, Numbers.four);
                    break;
                case "5":
                    nums.put(arg, Numbers.five);
                    break;
                case "6":
                    nums.put(arg, Numbers.six);
                    break;
                case "7":
                    nums.put(arg, Numbers.seven);
                    break;
                case "8":
                    nums.put(arg, Numbers.eight);
                    break;
                case "9":
                    nums.put(arg, Numbers.nine);
                    break;
                default:
                    System.out.println("Enter only numbers");
            }

        }
        char[][][] res = new char[args.length][][];
        int count = 0;
        for (Map.Entry<String, char[][]> pair : nums.entrySet()) {
            char[][] value = pair.getValue();
            res[count] = value;
            count++;
        }
        printPhraz(res);
    }

}
