package Mod12_Classes;

/*
Робозомби космопорта
*/

public class Solution_12_4 {

    public static final String[] lyrics = {"Du...", "Du hast...", "Du hast ultra metal"};

    public static void main(String[] args) {


        UltraMetal ultraMetal = new UltraMetal();
        ultraMetal.playUltraMetal(lyrics[0], lyrics[1], lyrics[2]);
    }
}
