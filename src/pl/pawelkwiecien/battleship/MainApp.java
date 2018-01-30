package pl.pawelkwiecien.battleship;

import java.util.Scanner;

import static pl.pawelkwiecien.battleship.BoardManager.*;
import static pl.pawelkwiecien.battleship.GameManager.*;
import static pl.pawelkwiecien.commons.StaticConsoleMessages.printGameOverMessage;

class MainApp {

    public static void main(String[] args) {

        boolean isPlayerTurn = true;

        Scanner scan = new Scanner(System.in);
        HumanPlayerManager player = new HumanPlayerManager();
        ComputerPlayerManager computer = new ComputerPlayerManager();

        Cell[][] computerBoard = createBoard();
        populateBoard(computerBoard);
        Cell[][] playerBoard = createBoard();


        while (player.inPlay() && computer.inPlay()) {
            if (isPlayerTurn) {
                isPlayerTurn = playerTurn(isPlayerTurn, scan, player, computerBoard);
            } else {
                isPlayerTurn = computerTurn(computer, playerBoard);
            }
        }
        printGameOverMessage();
    }

}