package pl.pawelkwiecien.battleship;

class ShipsManager {

    static void hitShip(Cell cell) {
        cell.setShipOnCell(false);
        cell.setWasTargeted(true);
    }

    static void missedShip(Cell cell) {
        cell.setWasTargeted(true);
    }

    static void populateBoard(Cell[][] board) {
        int shipsRemaining = 20;
        int row, column;
        while (shipsRemaining > 0) {
            row = (int) (Math.random() * 10);
            column = (int) (Math.random() * 10);
            if (board[row][column].shipOnCell()) {
                continue;
            }
            board[row][column].setShipOnCell(true);
            shipsRemaining--;
        }
    }


}
