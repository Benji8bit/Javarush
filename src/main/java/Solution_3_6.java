import java.util.Scanner;

/*
Ищем максимум
*/

public class Solution_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int max = numberA > numberB ? numberA : numberB;
        System.out.println (max);
    }
}
