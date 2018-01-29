package pl.pawelkwiecien.battleship;

import java.util.Scanner;

class ComputerPlayerManager extends PlayerManager {

    private static final int NUMBER_TO_LETTER_ASCII_MODIFIER = 65;
    private boolean inPlay = true;
    private int shipsRemaining = 10;


    public boolean evaluateShot(Cell[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        Cell currentCell;
        String input;
        int column;
        int row;
        do {
            column = (int) (Math.random() * 7);
            row = (int) (Math.random() * 7);
            currentCell = gameBoard[column][row];
        }
        while (currentCell.wasTargeted());
        int columnToDisplay = column + NUMBER_TO_LETTER_ASCII_MODIFIER;
        int rowToDisplay = row + 1;

        do {
            System.out.println("COMPUTER : I shoot at: "
                    + (char) columnToDisplay + rowToDisplay + "\n"
                    + "Did I hit You? (y/n)");
            input = scan.next().toLowerCase();
        } while (!input.equalsIgnoreCase("y")
                && !input.equalsIgnoreCase("n"));
        if (input.equalsIgnoreCase("y")) {
            markAsHit(currentCell);
            return false;
        } else if (input.equalsIgnoreCase("n")) {
            markAsMiss(currentCell);
        }
        return true;
    }

}
