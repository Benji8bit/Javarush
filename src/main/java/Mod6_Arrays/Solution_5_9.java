package Mod6_Arrays;/*
Взлом Кибердракона
*/

public class Solution_5_9 {
    public static int[] coordinates;

    public static void main(String[] args) {
        //напишите тут ваш код
        coordinates = new int[200];
        int pairNumber = 100;
        for (int i = 0; i<200; i++) {
            if (i%2==0) {
                coordinates[i] = i * 5;
            }
            else {
                coordinates[i] = i * 5 - 5 + 1;
            }
            System.out.print(coordinates[i] + ", ");
        }
    }
}