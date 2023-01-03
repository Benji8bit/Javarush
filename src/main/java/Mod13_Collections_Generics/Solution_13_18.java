package Mod13_Collections_Generics;

import java.util.ArrayList;
import java.util.Arrays;

/*
Прощай, Паскаль
*/

public class Solution_13_18 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        System.out.println(programmingLanguages.toString());
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages.toString());
    }
}
