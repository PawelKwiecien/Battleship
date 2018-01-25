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

    boolean isOver() {
        return gameOver;
    }

    void checkIfGameOver() {
        if (shipsRemaining == 0) {
            this.gameOver = true;
        }
    }

    void markAsHit(Cell cell) {
        cell.setShipOnCell(false);
        cell.setShipDestroyed(true);
        shipsRemaining--;
    }

    void markAsMiss(Cell cell) {
        cell.setWasTargeted(true);
    }
}
