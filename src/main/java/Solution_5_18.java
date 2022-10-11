import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class Solution_5_18 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        multiArray = new int[N][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[console.nextInt()];
        }
    }
}
