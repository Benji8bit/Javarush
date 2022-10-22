/*
Злобный призрак
*/

public class Solution_7_4 {
    public static String material = "материальный";
    public static String immaterial = "нематериальный";

    public static void main(String[] args) {
        System.out.println("Из болота вылез нематериальный монстр...");

        switchSword(immaterial);
    }

    public static void switchSword(String str) {
        System.out.println("Меч переключен в " + str + " режим.");
    }
}
