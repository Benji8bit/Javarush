package Loops_mod4;

import java.util.Scanner;

/*
Суммирование
*/

public class Solution_4_2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true)
        {
            String add = sc.nextLine();
            if (add.equalsIgnoreCase("ENTER"))
            {
                System.out.println(sum);
                break;
            }
            int addInt = Integer.parseInt(add);
            sum = sum + addInt;
        }
    }
}
