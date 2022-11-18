package Mod6_Arrays;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class Solution_5_11 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = console.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < num; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}