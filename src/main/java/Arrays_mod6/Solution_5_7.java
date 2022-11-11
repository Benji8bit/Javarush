package Arrays_mod6;/*
Охота на Кибердракона
*/

public class Solution_5_7 {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        int y = 0;

        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i]%2!=0) {
                x += coordinates[i];
            }
            else y += coordinates[i];
        }
        System.out.print("(" + x + ";" + y + ")");
    }
}
