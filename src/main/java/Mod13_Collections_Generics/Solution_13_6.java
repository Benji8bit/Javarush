package Mod13_Collections_Generics;

/*
Анализ строк
*/

public class Solution_13_6 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digits = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digits++;
            }
        }
        return digits;
    }

    public static int countLetters(String string) {
        int letters = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
            }
        }
        return letters;
    }

    public static int countSpaces(String string) {
        int spaces = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isWhitespace(aChar)) {
                spaces++;
            }
        }
        return spaces;
    }
}