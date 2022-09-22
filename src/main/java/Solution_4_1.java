import java.util.Scanner;

/*
Защита от землетрясения
*/

public class Solution_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int i =0;
        //напишите тут ваш код
        while (i<=number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
