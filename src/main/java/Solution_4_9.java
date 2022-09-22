import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution_4_9 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input<min) {
                min = input;
            }
        }
        System.out.println(min);
    }
}
