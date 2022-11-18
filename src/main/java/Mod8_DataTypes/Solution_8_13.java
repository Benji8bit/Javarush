package Mod8_DataTypes;/*
Гибкое заполнение массива
*/

import java.util.Arrays;

public class Solution_8_13 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        Arrays.fill(array, begin, end, value);
    }
}
