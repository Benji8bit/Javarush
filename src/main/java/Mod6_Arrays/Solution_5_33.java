package Mod6_Arrays;

import java.util.Arrays;

/*
Есть ли кто?
*/

public class Solution_5_33 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        System.out.println(Arrays.binarySearch(arrayCopy, element) > -1);
    }
}
