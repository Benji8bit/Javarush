import java.util.Scanner;

/*
Три числа
*/

public class Solution_3_3 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if ((num1==num2) && (num2==num3))
        System.out.println(num1 + " " + num2 + " " + num3);
        else if (num2==num3)
            System.out.println(num2 + " " + num3);
        else if (num3==num1)
            System.out.println(num3 + " " + num1);
        else if (num1==num2)
            System.out.println(num1 + " " + num2);
    }
}

