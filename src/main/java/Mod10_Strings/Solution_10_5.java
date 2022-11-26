package Mod10_Strings;

/*
Шестнадцатеричный конвертер
*/

public class Solution_10_5 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        char[] hexChars = HEX.toCharArray();
        if (decimalNumber <= 0) return "";
        while (decimalNumber > 0) {
            hexNumber = hexChars[(decimalNumber % 16)] + hexNumber;
            decimalNumber /= 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null) return 0;
        int decimalNumber = 0;
        char[] hexChars = HEX.toCharArray();
        char[] hexNumberArray = hexNumber.toCharArray();
        for (int i = 0; i < hexNumber.length(); i++) {
            int j = 0;
            int index = 0;
            while (j < hexChars.length) {
                if (hexNumberArray[i] == hexChars[j])
                    index = j;
                j++;
            }
            decimalNumber = 16 * decimalNumber + index; // формула из условия
        }
        return decimalNumber;
    }
}
