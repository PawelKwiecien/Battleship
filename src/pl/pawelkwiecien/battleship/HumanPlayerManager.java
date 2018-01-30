package pl.pawelkwiecien.battleship;

import static pl.pawelkwiecien.commons.StaticConsoleMessages.*;

class HumanPlayerManager extends PlayerManager{

    private boolean inPlay = true;
    private int shipsRemaining = 10;


    public boolean evaluateShot(Cell cell) {
        if (cell.wasTargeted()) {
            printWasTargeted();
            return true;
        } else if (!cell.hasShip() && !cell.wasTargeted()) {
            printMissed();
            markAsMiss(cell);
            return false;
        } else if (cell.hasShip()) {
            printHit();
            markAsHit(cell);
            return true;
        }
        return true;
    }

}
