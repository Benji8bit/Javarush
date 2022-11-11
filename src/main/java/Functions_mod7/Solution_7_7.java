package Functions_mod7;/*
Правильный порядок
*/

public class Solution_7_7 {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] test = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            test[i] = array[i];
        }
        for (int i = 0; i < test.length; i++) {
            array[i] = test[test.length - 1 - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
