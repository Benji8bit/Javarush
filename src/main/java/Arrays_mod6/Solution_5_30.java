package Arrays_mod6;

import java.util.Arrays;

/*
Заполняем массив
*/

public class Solution_5_30 {

    public static int[] array = new int[9];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код

        if ((array.length % 2) == 0) {
            Arrays.fill(array, 0, (array.length / 2), valueStart);
            Arrays.fill(array, (array.length / 2), array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, (array.length / 2 + 1), valueStart);
            Arrays.fill(array, (array.length / 2 + 1), array.length, valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }
}