package Mod4_Loops;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution_4_22 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int speedms = console.nextInt();

        double speedkmh = Math.round(3.6*speedms);

        System.out.println((int)speedkmh);
    }
}