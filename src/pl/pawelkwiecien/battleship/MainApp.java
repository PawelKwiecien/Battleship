package pl.pawelkwiecien.battleship;

import java.util.Scanner;

import static pl.pawelkwiecien.battleship.BoardManager.*;

class MainApp {

    public static void main(String[] args) {
        GameManager game = new GameManager();
        Scanner scan = new Scanner(System.in);
        Cell[][] gameBoard = game.prepareGame();
        displayBoard(gameBoard);

        while(!game.isGameOver()) {
            System.out.println("Take a shot: ");
            String input = scan.nextLine();
            int row = (int) (Math.random()*9);
            int column = (int) (Math.random()*9);
            System.out.println("row " + row + " column " + column);
            Cell currentCell = gameBoard[row][column];
            if (currentCell.shipOnCell()) {
                game.hitShip(currentCell);
            } else if (!currentCell.shipOnCell() && !currentCell.wasTargeted()) {
                game.missedShip(currentCell);
            } else if (currentCell.wasTargeted()) {
                System.out.println("This cell was already targeted");
                continue;
            }
            displayBoard(gameBoard);
            game.checkIfGameOver();
        }
        System.out.println("GAME OVER");
    }
}