package pl.pawelkwiecien.battleship;

import static pl.pawelkwiecien.commons.StaticConsoleMessages.*;

class HumanPlayerManager extends PlayerManager{

    private boolean inPlay = true;
    private int shipsRemaining = 10;


    public boolean evaluateShot(Cell cell) {
        if (cell.wasTargeted()) {
            printWasTargetedMessage();
            return true;
        } else if (!cell.hasShip() && !cell.wasTargeted()) {
            printMissedMessage();
            markAsMiss(cell);
            return false;
        } else if (cell.hasShip()) {
            printHitMessage();
            markAsHit(cell);
            return true;
        }
        return true;
    }

}
