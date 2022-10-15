import java.util.Arrays;

/*
Галаксианские роботанки (1)
*/

public class Solution_5_23 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";

    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                Arrays.fill(field[i], empty);
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
