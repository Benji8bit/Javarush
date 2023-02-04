package Mod14_Collections;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution_14_11 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("John Smith", 4.2);
        grades.put("LaMar Jackson", 4.5);
        grades.put("Robert Parish", 4.0);
        grades.put("Thomas Mann", 3.1);
        grades.put("Isaak Partridge", 3.5);
    }
}
