package Mod14_Collections;

/*
Спасти рядового Компиляена
*/

import java.util.*;

public class Solution_14_10 {

    public static List<Integer> ratingsList = new ArrayList<>();

    public static void main(String[] args) {
        setRatings();
        printList(); // before
        improveRatings();
        printList(); // after
    }

    public static void changeNegativeNumbers() {
        for (int value :
                ratingsList) {
            if (value < 0)
                Collections.replaceAll(ratingsList, value, value*-1);
        }
    }

    public static void changeZerosToMaximumNumber() {
        for (int value :
                ratingsList) {
            if (value == 0)
                Collections.replaceAll(ratingsList, value, Collections.max(ratingsList));
        }
    }

    public static void reverseList() {
        Collections.sort(ratingsList);
        Collections.reverse(ratingsList);
    }

    public static void improveRatings() {
        changeNegativeNumbers();
        changeZerosToMaximumNumber();
        reverseList();
    }

    private static void setRatings() {
        int rating;
        Random random = new Random();
        int min = -5;
        int max = 11;

        for (int i = 0; i < 20; i++) {
            rating = random.nextInt(max - min) + min;
            ratingsList.add(rating);
        }
    }

    private static void printList() {
        ratingsList.forEach((value) -> System.out.print(value + " "));
        System.out.println();
    }
}
