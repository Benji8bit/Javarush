package Mod7_Functions;/*
У всего есть корень
*/

public class Solution_7_16 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double sqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + sqrt);
        }
    }
}
