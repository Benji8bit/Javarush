package Mod9_Features;

/*
Степень двойки
*/

public class Solution_9_16 {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return 2 << power - 1;
    }
}

