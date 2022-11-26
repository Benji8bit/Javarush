package Mod10_Strings;

/*
Двоичный конвертер
*/

public class Solution_10_4 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) return "";
        while (decimalNumber > 0) {
            binaryNumber = String.valueOf(decimalNumber % 2) + binaryNumber;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null) return 0;
        int maxIdx = binaryNumber.length() - 1; // вычисляем индекс самого правого символа
        for (int i = 0; i < binaryNumber.length(); i++) {
            char currChar = binaryNumber.charAt(maxIdx - i); // получаем самый правый символ
            //в текущем витке цикла
            int currNum = Character.getNumericValue(currChar); // переводим его в целое число
            decimalNumber = decimalNumber + currNum * (int) Math.pow(2, i); // формула из условия
        }
        return decimalNumber;
    }
}
