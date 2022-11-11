package MeetingIf_mod3;

import java.util.Scanner;

/*
Тепло или холодно
*/

public class Solution_3_1 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int tempNow = console.nextInt();

        if (tempNow < 0) {
            System.out.println(cold);
        }
        else {
            System.out.println(warm);
        }

    }
}