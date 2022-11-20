package Mod10_Literals;

import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/

public class Solution_10_3 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalNumber = 00;
        if (decimalNumber <= 0) return 0;
        for (int i = 0; decimalNumber != 0; i++) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * (Math.pow(10, i)));
            decimalNumber /= 8;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) return 0;
        for (int i = 0; octalNumber != 0 ; i++) {
            decimalNumber = (int) (decimalNumber + (octalNumber%10) * (Math.pow(8, i)));
            octalNumber /= 10;
        }
        return decimalNumber;
    }
}
