package Mod15_Exceptions;

/*
Проглатываем исключение
*/

public class Solution_15_8 {

    public static String errorMessage = "не повезло";

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}

