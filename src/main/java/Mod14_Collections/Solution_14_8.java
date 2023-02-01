package Mod14_Collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/*
Изучаем методы класса Collections, часть 2
*/

public class Solution_14_8 {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}

