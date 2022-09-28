import java.util.Scanner;

/*
Площадь круга
*/

public class Solution_4_20 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();
        double pi = 3.14;

        double square = pi*radius*radius;
        System.out.println((int)square);
    }
}
