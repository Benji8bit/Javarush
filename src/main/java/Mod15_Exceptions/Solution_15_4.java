package Mod15_Exceptions;

/*
Проверка Робозомби
*/

public class Solution_15_4 {

    public static void main(String[] args) {
        startTest();
    }

    public static void startTest() {
        try {
            System.out.println(2 / 2);
            question2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void question2() {
        try {
            System.out.println((char) 1);
            question3();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void question3() {
        char[] array = {'T', 'e', 's', 't',};
        try {
            System.out.println(array[3]);
            question4();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void question4() {
        try {
            int num = Integer.parseInt("1");
            System.out.println("All tests passed. You may go.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
