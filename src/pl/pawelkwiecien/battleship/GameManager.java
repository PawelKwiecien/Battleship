package pl.pawelkwiecien.battleship;

import static pl.pawelkwiecien.battleship.BoardManager.*;
import static pl.pawelkwiecien.battleship.ShipsManager.*;

class GameManager {

    private boolean gameOver = false;
    private int shipsRemaining = 20;

    void displayBoard(Cell[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].shipOnCell()) {
                    System.out.print("*|");
                } else if (!board[i][j].shipOnCell()) {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }

    Cell[][] prepareGame() {
        Cell[][] board = createBoard();
        populateBoard(board);
        return board;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
