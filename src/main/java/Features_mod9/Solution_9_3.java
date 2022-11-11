package Features_mod9;

import java.util.Scanner;

/*
Минимальный элемент массива
*/

public class Solution_9_3 {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int anInt : ints) {
            min = Math.min(min, anInt);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int[] tempArray = new int[10];
        for (int i = 0; i < 10; i++) {
            tempArray[i] = sc.nextInt();
        }
        return tempArray;
    }
}
