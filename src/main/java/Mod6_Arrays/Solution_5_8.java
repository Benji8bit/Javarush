package Mod6_Arrays;/*
Объединяем массивы
*/

public class Solution_5_8 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        resultArray = new int[firstArray.length + secondArray.length];

        for (int j = 0; j < firstArray.length; j++) {
            resultArray[j] = firstArray[j];
        }

        for (int n = 0; n < secondArray.length; n++) {
            resultArray[firstArray.length + n] = secondArray[n];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
