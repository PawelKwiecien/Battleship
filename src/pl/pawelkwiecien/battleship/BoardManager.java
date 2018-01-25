package pl.pawelkwiecien.battleship;

class BoardManager {

    static Cell[][] createBoard() {
        Cell[][] gameBoard = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = new Cell();
            }
        }
        return gameBoard;
    }

}
