package Mod10_Literals;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution_10_6 {

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        char[] hexChars = HEX.toCharArray();
        if ((binaryNumber == null) || (binaryNumber == "")) return "";

        char[] binChars = binaryNumber.toCharArray();
        String[] binString = new String[2];

        while (binChars.length % 4 != 0) {
            binString[0] = "0";
            binString[1] = binaryNumber;
            binaryNumber = binString.toString();
        }
        binChars = binaryNumber.toCharArray();
        System.out.println(Arrays.toString(binChars));

        for (int i = 0; i < binChars.length; i += 4) {
            String binQuart = String.valueOf(binChars[i]) + String.valueOf(binChars[i + 1]) + String.valueOf(binChars[i + 2]) +
                    String.valueOf(binChars[i + 3]);
            System.out.println(binChars[i]);
            System.out.println(binChars[i+1]);
            System.out.println(binChars[i+2]);
            System.out.println(binChars[i+3]);
            System.out.println(binQuart);

            switch (binQuart) {
                case ("0000"):
                    hexNumber = hexNumber + "0";
                    break;
                case ("0001"):
                    hexNumber = hexNumber + "1";
                    break;
                case ("0010"):
                    hexNumber = hexNumber + "2";
                    break;
                case ("0011"):
                    hexNumber = hexNumber + "3";
                    break;
                case ("0100"):
                    hexNumber = hexNumber + "4";
                    break;
                case ("0101"):
                    hexNumber = hexNumber + "5";
                    break;
                case ("0110"):
                    hexNumber = hexNumber + "6";
                    break;
                case ("0111"):
                    hexNumber = hexNumber + "7";
                    break;
                case ("1000"):
                    hexNumber = hexNumber + "8";
                    break;
                case ("1001"):
                    hexNumber = hexNumber + "9";
                    break;
                case ("1010"):
                    hexNumber = hexNumber + "a";
                    break;
                case ("1011"):
                    hexNumber = hexNumber + "b";
                    break;
                case ("1100"):
                    hexNumber = hexNumber + "c";
                    break;
                case ("1101"):
                    hexNumber = hexNumber + "d";
                    break;
                case ("1110"):
                    hexNumber = hexNumber + "e";
                    break;
                case ("1111"):
                    hexNumber = hexNumber + "f";
                    break;
                default:
                    break;
            }
            System.out.println(hexNumber);
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}

