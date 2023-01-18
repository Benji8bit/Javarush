package Mod13_Collections_Generics;

import java.util.ArrayList;

/*
Двойные фигурные скобки
*/

public class Solution_13_24 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>() {
            {
                add("Так");
                add("тоже");
                add("можно");
                add("делать");
                add("!");
            }
        };
    }
}

