package pl.pawelkwiecien.battleship;

import java.util.Scanner;

import static pl.pawelkwiecien.battleship.BoardManager.*;

class MainApp {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Scanner scan = new Scanner(System.in);
        Cell[][] gameBoard = gameManager.prepareGame();
        displayBoard(gameBoard);
    }
}