import java.util.Scanner;

/*
Reverse
*/

public class Solution_5_10 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = console.nextInt();
        }

        for (int i = 0; i < number; i++) {

        }

        if (number % 2 != 0) {
            for (int i = 0; i < number; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            for (int i = number - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
