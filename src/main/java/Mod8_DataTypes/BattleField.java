package Mod8_DataTypes;/*
Галавир XIII (3)
*/

public class BattleField {
    public static String nimrodDefence = "Вражеская атака отбита";
    public static String nimrodAttack = "Наносим контр удар";
    public static String nimrodDestroy = "Вражеский удар не выдержан";
    public static String galavirDefence = "Наша атака успешно отражена врагом";
    public static String galavirAttack = "Враг наносит удар";
    public static String galavirDestroy = "Вражеский корабль повержен";

    public static void main(String[] args) {
        GalavirXIII galavir = new GalavirXIII();
        Nimrod nimrod = new Nimrod();

        do {
            System.out.println(galavirAttack);
            int strike = galavir.attack();
            nimrod.defend(strike);
            if (isNimrodAlive(nimrod)) {
                System.out.println(nimrodAttack);
                int counterStrike = nimrod.attack();
                galavir.defend(counterStrike);
                if (!isGalavirAlive(galavir)) {
                    break;
                }
            } else break;
        }
        while (isNimrodAlive(nimrod));
    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}
