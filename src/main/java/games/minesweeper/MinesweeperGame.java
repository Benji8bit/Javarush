//package com.javarush.games.minesweeper;

//import com.javarush.engine.cell.*;


package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;


public class MinesweeperGame extends Game {

    private static final int SIDE = 9;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private int countMinesOnField = 0;

    public void initialize() {

        setScreenSize(SIDE, SIDE);

        createGame();

    }

    private void createGame() {
        boolean isMine = false;
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                if (getRandomNumber(10) == 9){
                    isMine = true;
                    countMinesOnField += 1;
                }
            }
        }
    }
}