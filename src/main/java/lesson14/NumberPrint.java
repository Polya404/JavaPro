package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static lesson14.LetterStars.printPhraz;

public class NumberPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, char[][]> nums = new HashMap<>();
        if (args.length == 0) {
            System.out.println("Enter numbers");
        }
        for (String arg : args) {
            switch (arg) {
                case "0":
                    arrayList.add("0");
                    nums.put(arg, Numbers.zero);
                    break;
                case "1":
                    arrayList.add("1");
                    nums.put(arg, Numbers.one);
                    break;
                case "2":
                    arrayList.add("2");
                    nums.put(arg, Numbers.two);
                    break;
                case "3":
                    arrayList.add("3");
                    nums.put(arg, Numbers.three);
                    break;
                case "4":
                    arrayList.add("4");
                    nums.put(arg, Numbers.four);
                    break;
                case "5":
                    arrayList.add("5");
                    nums.put(arg, Numbers.five);
                    break;
                case "6":
                    arrayList.add("6");
                    nums.put(arg, Numbers.six);
                    break;
                case "7":
                    arrayList.add("7");
                    nums.put(arg, Numbers.seven);
                    break;
                case "8":
                    arrayList.add("8");
                    nums.put(arg, Numbers.eight);
                    break;
                case "9":
                    arrayList.add("9");
                    nums.put(arg, Numbers.nine);
                    break;
                default:
                    System.out.println("Enter only numbers");
            }

        }
        char[][][] res = new char[args.length][][];

        for (int i = 0; i < arrayList.size(); i++) {
            switch (arrayList.get(i)) {
                case "0":
                    res[i] = nums.get("0");
                    break;
                case "1":
                    res[i] = nums.get("1");
                    break;
                case "2":
                    res[i] = nums.get("2");
                    break;
                case "3":
                    res[i] = nums.get("3");
                    break;
                case "4":
                    res[i] = nums.get("4");
                    break;
                case "5":
                    res[i] = nums.get("5");
                    break;
                case "6":
                    res[i] = nums.get("6");
                    break;
                case "7":
                    res[i] = nums.get("7");
                    break;
                case "8":
                    res[i] = nums.get("8");
                    break;
                case "9":
                    res[i] = nums.get("9");
                    break;
                default:
                    System.out.println("Enter only numbers");
            }
        }
        try {
            printPhraz(res, args.length);
        }catch (NullPointerException e){
            e.getMessage();
        }


    }

}
