package Mod4_Loops;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution_4_10 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE-1;

        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input<min1) {
                min2 = min1;
                min1 = input;
            }
            else if ((input>min1)&&(input<min2)) {
                min2 = input;
            }
        }
//        System.out.println(min1);
        System.out.println(min2);
    }
}
