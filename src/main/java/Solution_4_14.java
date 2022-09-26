import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution_4_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //напишите тут ваш код
        int sum = 0;
        for (int i =0; i<5; i++) {
            sum+= scanner.nextInt();
        }
        int avg = sum/5;
        System.out.println(avg);
    }
}