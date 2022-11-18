package Mod9_Features;/*
Randomizer
*/

public class Solution_9_5 {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return  (int) (Math.random() * 99);
    }
}
