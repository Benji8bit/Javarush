import java.util.Arrays;
import java.util.Objects;

/*
Галаксианские роботанки (5)
*/

public class Solution_5_27 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";

    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];

    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
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

/*        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }*/

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                if (field[i][j].equals(robotank)) {

                    for (int x = 0; x < bombs.length; x++) {
                        for (int y = 0; y < bombs[x].length; y++) {
                            Arrays.fill(bombs[x], 0);
                        }
                    }

                    for (int x = 0; x < bombs.length; x++) {
                        for (int y = 0; y < bombs[x].length; y++) {
                            for (int n = 0; n < 10; n++) {
                                y = (int) (Math.random() * bombs[x].length);
                                if (bombs[x][y] == 1) {
                                    n--;
                                } else {
                                    bombs[x][y] = 1;
                                }
                            }
                            break;
                        }
                    }

/*                    for (int x = 0; x < bombs.length; x++) {
                        for (int y = 0; y < bombs[x].length; y++) {
                            System.out.print(bombs[x][y]);
                        }
                        System.out.println();
                    }

                    for (int x = 0; x < field.length; x++) {
                        for (int y = 0; y < field[x].length; y++) {
                            System.out.print(field[x][y]);
                        }
                        System.out.println();
                    }*/

                    if ((field[i][j].equals(robotank)) && (bombs[i][j] == 1)) {
                        field[i][j] = hit;

                    }
                    j--;
                }
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
