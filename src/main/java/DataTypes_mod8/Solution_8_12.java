package DataTypes_mod8;/*
Массив значений
*/

import java.util.Arrays;

public class Solution_8_12 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        Arrays.fill(array, value);
    }
}