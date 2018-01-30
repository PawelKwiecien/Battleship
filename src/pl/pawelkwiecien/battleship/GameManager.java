package pl.pawelkwiecien.battleship;

import java.util.Scanner;

import static pl.pawelkwiecien.battleship.BoardManager.displayBoard;
import static pl.pawelkwiecien.commons.StaticConsoleMessages.*;
import static pl.pawelkwiecien.commons.StaticSupportMethods.*;

class GameManager {

    static boolean playerTurn(Scanner scan,
                              HumanPlayerManager player,
                              Cell[][] computerBoard) {

        boolean isPlayerTurn = false;
        displayBoard(computerBoard);
        printTakeAShotMessage();
        String input = scan.nextLine().toLowerCase();

        if (isValid(input)) {
            Cell currentCell = computerBoard[generateRow(input)][generateColumn(input)];
            isPlayerTurn = player.evaluateShot(currentCell);
        } else {
            printInvalidCellNumberMessage();
        }

        player.checkIfGameOver();
        return isPlayerTurn;
    }


    static boolean computerTurn(ComputerPlayerManager computer, Cell[][] playerBoard) {
        boolean isPlayerTurn;
        isPlayerTurn = computer.evaluateShot(playerBoard);
        computer.checkIfGameOver();
        return isPlayerTurn;
    }

}
