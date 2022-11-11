package MeetingIf_mod3;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution_3_7 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double One = sc.nextDouble();
        double Two = sc.nextDouble();

        if ( Math.abs(Two - One) < 0.000001 )
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}