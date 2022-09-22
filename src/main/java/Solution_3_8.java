import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution_3_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        //напишите тут ваш код
        if (s1.equals(s2))
            System.out.println("строки одинаковые");
            //напишите тут ваш код
        else
            System.out.println("строки разные");
    }
}