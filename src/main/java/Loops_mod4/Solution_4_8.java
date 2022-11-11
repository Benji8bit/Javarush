package Loops_mod4;

import java.util.Scanner;

/*
Максимум из введенных чисел
*/

public class Solution_4_8 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if ((input>max)&&(input%2==0)) {
                max = input;
            }
        }
        System.out.println(max);
    }
}
