package Loops_mod4;

import java.util.Scanner;

/*
Стакан наполовину пуст или наполовину полон?
*/

public class Solution_4_23 {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        boolean mood = console.nextBoolean();

        if (mood==true) {
            System.out.println((int)Math.ceil(glass));
        }
        else if (mood==false) {
            System.out.println((int)Math.floor(glass));
        }
    }
}
