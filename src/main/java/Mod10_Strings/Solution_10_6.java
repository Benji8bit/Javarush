package Mod10_Strings;

/*
Двоично-шестнадцатеричный конвертер
*/

import java.util.Arrays;

public class Solution_10_6 {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        StringBuilder hexNumber = new StringBuilder();
        if ((binaryNumber == null) || (binaryNumber.equals(""))) return "";

        char[] binChars = binaryNumber.toCharArray();
        String[] binString = new String[2];

        while (binChars.length % 4 != 0) {
            binString[0] = "0";
            binString[1] = binaryNumber;
            binaryNumber = Arrays.toString(binString);
        }
        binChars = binaryNumber.toCharArray();
        //System.out.println(Arrays.toString(binChars));

        for (int i = 0; i < binChars.length; i += 4) {
            String binQuart = binChars[i] + String.valueOf(binChars[i + 1]) + binChars[i + 2] +
                    binChars[i + 3];

            switch (binQuart) {
                case ("0000"):
                    hexNumber.append("0");
                    break;
                case ("0001"):
                    hexNumber.append("1");
                    break;
                case ("0010"):
                    hexNumber.append("2");
                    break;
                case ("0011"):
                    hexNumber.append("3");
                    break;
                case ("0100"):
                    hexNumber.append("4");
                    break;
                case ("0101"):
                    hexNumber.append("5");
                    break;
                case ("0110"):
                    hexNumber.append("6");
                    break;
                case ("0111"):
                    hexNumber.append("7");
                    break;
                case ("1000"):
                    hexNumber.append("8");
                    break;
                case ("1001"):
                    hexNumber.append("9");
                    break;
                case ("1010"):
                    hexNumber.append("a");
                    break;
                case ("1011"):
                    hexNumber.append("b");
                    break;
                case ("1100"):
                    hexNumber.append("c");
                    break;
                case ("1101"):
                    hexNumber.append("d");
                    break;
                case ("1110"):
                    hexNumber.append("e");
                    break;
                case ("1111"):
                    hexNumber.append("f");
                    break;
                default:
                    break;
            }
            //System.out.println(hexNumber);
        }
        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        char[] hexNumArray = hexNumber.toCharArray();
        if (hexNumber.equals("")) return "";

        for (char c : hexNumArray) {
            switch (c) {
                case ('0') -> binaryNumber.append("0000");
                case ('1') -> binaryNumber.append("0001");
                case ('2') -> binaryNumber.append("0010");
                case ('3') -> binaryNumber.append("0011");
                case ('4') -> binaryNumber.append("0100");
                case ('5') -> binaryNumber.append("0101");
                case ('6') -> binaryNumber.append("0110");
                case ('7') -> binaryNumber.append("0111");
                case ('8') -> binaryNumber.append("1000");
                case ('9') -> binaryNumber.append("1001");
                case ('a') -> binaryNumber.append("1010");
                case ('b') -> binaryNumber.append("1011");
                case ('c') -> binaryNumber.append("1100");
                case ('d') -> binaryNumber.append("1101");
                case ('e') -> binaryNumber.append("1110");
                case ('f') -> binaryNumber.append("1111");
                default -> {
                }
            }
        }
        return binaryNumber.toString();
    }
}

