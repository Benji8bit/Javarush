package Mod4_Loops;

import java.util.Scanner;

/*
Share a Coke
*/

public class Solution_4_21 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int coke = console.nextInt();
        int nerds = console.nextInt();

        System.out.println((double) coke/nerds);
    }
}
