import java.util.Scanner;

/*
Показываем, что получаем
*/

public class Solution_4_5 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("enough")) break;
            System.out.println(s);
        }
    }
}
