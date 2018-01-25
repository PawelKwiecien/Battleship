package pl.pawelkwiecien.battleship;

import static pl.pawelkwiecien.battleship.BoardManager.*;

class GameManager {

    private boolean gameOver = false;
    private int shipsRemaining = 20;

    Cell[][] prepareGame() {
        Cell[][] board = createBoard();
        populateBoard(board);
        return board;
    }

    boolean isGameOver() {
        return gameOver;
    }

    void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    int getShipsRemaining() {
        return shipsRemaining;
    }

    void checkIfGameOver() {
        if (shipsRemaining == 0) {
            setGameOver(true);
        }
    }

    void hitShip(Cell cell) {
        cell.setShipOnCell(false);
        cell.setWasTargeted(true);
        shipsRemaining--;
    }

    void missedShip(Cell cell) {
        cell.setWasTargeted(true);
    }
}
