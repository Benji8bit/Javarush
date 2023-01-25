package Mod14_Collections;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/*
Проверка присутствия
*/

public class Solution_14_1 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.printf("Слово %s есть в множестве", word);
        } else {
            System.out.printf("Слова %s нет в множестве", word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
