package Mod4_Loops;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution_4_15 {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        //напишите тут ваш код
        do {
            int stop = bombInterface.nextInt();
            System.out.println(stop);
            if (stop%10 == 0) break;
        }
        while (bombInterface.hasNextInt());
    }
}