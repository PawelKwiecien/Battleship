package pl.pawelkwiecien.battleship;

public class BoardManager {

    static BoardCell[][] createBoard() {
        BoardCell[][] gameBoard = new BoardCell[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gameBoard[i][j] = new BoardCell();
            }
        }
        return gameBoard;
    }

}
