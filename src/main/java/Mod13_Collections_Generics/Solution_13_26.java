package Mod13_Collections_Generics;

import java.util.ArrayList;

/*
Охотники за привидением: в погоне за типами
*/

public class Solution_13_26 {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object element : elements) {
            if (element instanceof String) {
                printString();
            } else if (element instanceof Integer) {
                printInteger();
            } else if (element instanceof Integer[]) {
                printIntegerArray();
            } else
                printUnknown();
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}

