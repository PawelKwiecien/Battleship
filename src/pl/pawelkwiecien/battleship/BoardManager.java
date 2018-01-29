package pl.pawelkwiecien.battleship;

class BoardManager {

    private static final int NUMBER_OF_ROWS = 8;
    private static final int NUMBER_OF_COLUMNS = 8;

    static Cell[][] createBoard() {
        Cell[][] gameBoard = new Cell[NUMBER_OF_COLUMNS][NUMBER_OF_ROWS];
        for (int columnIndex = 0; columnIndex < NUMBER_OF_COLUMNS; columnIndex++) {
            for (int rowIndex = 0; rowIndex < NUMBER_OF_ROWS; rowIndex++) {
                gameBoard[columnIndex][rowIndex] = new Cell();
            }
        }
        return gameBoard;
    }


    static void populateBoard(Cell[][] board) {
        int shipsRemaining = 10;
        int rowIndex, columnIndex;
        while (shipsRemaining > 0) {
            columnIndex = (int) (Math.random() * NUMBER_OF_COLUMNS);
            rowIndex = (int) (Math.random() * NUMBER_OF_ROWS);
            if (board[columnIndex][rowIndex].hasShip()) {
                continue;
            }
            board[columnIndex][rowIndex].setShipOnCell(true);
            shipsRemaining--;
        }
    }


    static void displayBoard(Cell[][] board) {
        System.out.println("   [A][B][C][D][E][F][G][H]");
        for (int columnIndex = 0; columnIndex < NUMBER_OF_COLUMNS; columnIndex++) {
            System.out.print("[" + (columnIndex + 1) + "]");
            for (int rowIndex = 0; rowIndex < NUMBER_OF_ROWS; rowIndex++) {
                Cell currentCell = board[columnIndex][rowIndex];
                if (currentCell.wasTargeted() && !currentCell.hasShipDestroyed()) {
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
