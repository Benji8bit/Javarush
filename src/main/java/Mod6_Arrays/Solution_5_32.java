package Mod6_Arrays;

import java.util.Arrays;

/*
Сортировка массива
*/

public class Solution_5_32 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int[][] ar = new int[5][8];
    public static int[][] ar1 = new int[5][7];

    public static void main(String[] args) {
        //напишите тут ваш код
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ar[0].length);
        System.out.println(Arrays.deepEquals(ar, ar1));
    }
}
