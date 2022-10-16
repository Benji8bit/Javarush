import java.util.Arrays;

/*
Галаксианские роботанки (3)
*/

public class Solution_5_25 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";

    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];

    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                Arrays.fill(field[i], empty);
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                j = (int) (Math.random() * field[i].length);
                field[i][j] = robotank;
                break;
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                Arrays.fill(bombs[i], 0);
            }
        }

        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                for (int n = 0; n < 10; n++) {
                    j = (int) (Math.random() * bombs[i].length);
                    if (bombs[i][j] == 1) {
                        n--;
                    } else {
                        bombs[i][j] = 1;
                    }
                }
                break;
            }
        }

        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                System.out.print(bombs[i][j]);
            }
            System.out.println();
        }
    }
}
