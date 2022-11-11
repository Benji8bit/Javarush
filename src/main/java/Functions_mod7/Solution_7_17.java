package Functions_mod7;/*
Что происходит?
*/

public class Solution_7_17 {
    public static String demons = "демоны";

    public static void main(String[] args) {
        changeDemons();
        if ("демоны".equals(demons)) {
            System.out.println("На друзей напали демоны.");
        }

        if ("погрузочные машины".equals(demons)) {
            System.out.println("Друзья превратили демонов в погрузочные машины.");
        }
    }

    public static void changeDemons() {
        demons = "погрузочные машины";
    }
}
