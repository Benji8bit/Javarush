package Mod15_Exceptions;

/*
Пропускаем сквозь себя
*/

public class Solution_15_9 {

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}