package Mod4_Loops;

import java.util.Scanner;

/*
Сумма кратных чисел
*/

public class Solution_4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишите тут ваш код

        for (int i=start; i<end; i++){
            if (i%multiple!=0) continue;
            sum+=i;
        }

        System.out.println(sum);
    }
}
