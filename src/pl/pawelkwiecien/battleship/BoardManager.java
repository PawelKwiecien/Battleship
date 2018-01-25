package pl.pawelkwiecien.battleship;

class BoardManager {

    static Cell[][] createBoard() {
        Cell[][] gameBoard = new Cell[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gameBoard[i][j] = new Cell();
            }
        }
        return gameBoard;
    }

    static void populateBoard(Cell[][] board) {
        int shipsRemaining = 20;
        int row, column;
        while (shipsRemaining > 0) {
            row = (int) (Math.random() * 8);
            column = (int) (Math.random() * 8);
            if (board[row][column].hasShip()) {
                continue;
            }
            board[row][column].setShipOnCell(true);
            shipsRemaining--;
        }
    }

    static void displayBoard(Cell[][] board) {
        System.out.println("   [A][B][C][D][E][F][G][H]");
        for (int i = 0; i < board.length; i++) {
            System.out.print("[" + (i+1) + "]");
            for (int j = 0; j < board.length; j++) {
                Cell currentCell = board[i][j];
                if (currentCell.wasTargeted()) {
                    System.out.print("[-]");
                } else if (currentCell.hasShipDestroyed()) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

}
