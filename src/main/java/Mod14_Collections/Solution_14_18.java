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
        Board board = new Board();
        List<Board.Node> boardNodes = board.getBoardNodes();
        for (Board.Node node : boardNodes) {
            String str = node.getData();
            if (str.contains("snake")) {
                node.setData("board");
            }
        }
        return boardNodes;
    }

    private static void printList(List<?> list) {

        list.forEach(element -> System.out.print(element + " "));
    }
}

