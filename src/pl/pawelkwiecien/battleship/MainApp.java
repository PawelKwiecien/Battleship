package pl.pawelkwiecien.battleship;

import java.util.Scanner;

import static pl.pawelkwiecien.battleship.BoardManager.*;
import static pl.pawelkwiecien.battleship.StaticSupportMethods.*;

class MainApp {

    public static void main(String[] args) {
        GameManager game = new GameManager();
        Scanner scan = new Scanner(System.in);
        Cell[][] gameBoard = game.prepareGame();
        Cell currentCell;
        String input;
        displayBoard(gameBoard);

        while (!game.isOver()) {
            System.out.println("Take a shot: ");
            input = scan.nextLine().toLowerCase();

            if (isValid(input)) {
                int row = generateRow(input);
                int column = generateColumn(input);
                currentCell = gameBoard[row][column];

                if (currentCell.hasShip()) {
                    game.markAsHit(currentCell);
                } else if (!currentCell.hasShip() && !currentCell.wasTargeted()) {
                    game.markAsMiss(currentCell);
                } else if (currentCell.wasTargeted()) {
                    System.out.println("This cell was already targeted");
                    continue;
                }
            } else {
                System.out.println("Invalid cell number.");
                continue;
            }


            displayBoard(gameBoard);
            game.checkIfGameOver();
        }
        System.out.println("\nGAME OVER");
    }
}