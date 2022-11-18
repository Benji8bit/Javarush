package Mod7_Functions;/*
Добро пожаловать! Но не всем.
*/

public class Solution_7_10 {

    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.equalsIgnoreCase("user"))
            return;
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
