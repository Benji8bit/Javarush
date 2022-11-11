package Arrays_mod6;

import java.util.Scanner;
import java.util.SimpleTimeZone;

/*
Удаляем одинаковые строки
*/

public class Solution_5_13 {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }

        String temp = new String();
        //temp = null;

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if ((i == j) || (strings[i] == null) || (strings[j] == null)) continue;
                if (strings[i].equals(strings[j])) {
                    temp = strings[j];
                    strings[i] = null;
                    strings[j] = null;
                }
                for (int n = 0; n < strings.length; n++) {
                    if ((strings[n]!=null)&&(strings[n].equals(temp))) {
                        strings[n] = null;
                    }
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
