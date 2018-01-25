package pl.pawelkwiecien.battleship;

import java.util.Scanner;

class MainApp {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Scanner scanner = new Scanner(System.in);
        Cell[][] gameBoard= gameManager.prepareGame();
        gameManager.displayBoard(gameBoard);
    }


}
