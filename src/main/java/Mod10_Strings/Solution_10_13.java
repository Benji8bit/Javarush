package Mod10_Strings;

/*
Взлом Стального Стива
*/

import java.util.Arrays;

public class Solution_10_13 {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (String[] moral : morals) {
            for (int i = 0; i < moral.length; i++) {
                if (moral[i].toLowerCase().contains("killer".toLowerCase()))
                    moral[i] = moral[i].replaceAll(moral[i], "compassion");
                else if (moral[i].toLowerCase().contains("thief".toLowerCase()))
                    moral[i] = moral[i].replaceAll(moral[i], "fairness");
                else if (moral[i].toLowerCase().contains("bully".toLowerCase()))
                    moral[i] = moral[i].replaceAll(moral[i], "respect");
            }
        }
    }
}
