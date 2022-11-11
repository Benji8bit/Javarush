package Arrays_mod6;

import java.util.Arrays;

/*
Атака вирусов
*/

public class Solution_5_16 {
    public static int[][] array = new int[][]{{1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 0}};

    public static void main(String[] args) {

        printArray();

        //напишите тут ваш код
        int[] temp = array[0];
        array[0] = array[2];
        array[2] = temp;

        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}