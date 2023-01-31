package Mod14_Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
Изучаем методы класса Collections, часть 1
*/

public class Solution_14_7 {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}