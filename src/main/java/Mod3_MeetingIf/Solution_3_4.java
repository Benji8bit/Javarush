package Mod3_MeetingIf;

import java.util.Scanner;

/*
Треугольник
*/

public class Solution_3_4 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 < (side2 + side3)) && (side2 < (side1 + side3))
                && (side3 < (side1 + side2))) {
            System.out.println(TRIANGLE_EXISTS);
        }
        else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}

