import java.util.Scanner;

/*
Страшное число
*/

public class Solution_4_4 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);

    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        //напишите тут ваш код
        while (true) {
            inputNumber = scanner.nextInt();
            if (inputNumber!=number)
                System.out.println("Попробуй еще раз");
            else
                break;
        }
        System.out.println("Загадочное число равно " + number);
    }
}

