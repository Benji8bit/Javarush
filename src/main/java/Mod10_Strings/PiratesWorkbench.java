package Mod10_Strings;

/*
Закосить под пиратов
*/

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int counter = 0;
        for (int i = 0; i < piratesDB.length; i++) {
            if ((piratesDB[i].indexOf('b') > -1) && (counter < 2)) {
                piratesDB[i] = piratesDB[i].replaceAll("(?i)b", "\b");
                counter++;
            }
        }
    }

    public static void addTwoNames() {
        String[] piratesDBnew = new String[piratesDB.length + 2];
        System.arraycopy(piratesDB, 0, piratesDBnew, 0, piratesDB.length);
        piratesDBnew[piratesDB.length] = "Рыжий Амиго";
        piratesDBnew[piratesDB.length + 1] = "Одноглазый Диего";
        piratesDB = piratesDBnew;
    }
}
