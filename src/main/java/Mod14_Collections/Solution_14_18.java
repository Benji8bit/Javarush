package Mod14_Collections;

/*
Дорога к выходу
*/

import java.util.List;

public class Solution_14_18 {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        //напишите тут ваш код
        return null;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}

