package pl.pawelkwiecien.battleship;

public abstract class PlayerManager {

    private boolean inPlay = true;
    private int shipsRemaining = 10;


    public boolean inPlay() {
        return inPlay;
    }

    public void checkIfGameOver() {
        if (shipsRemaining == 0) {
            inPlay = false;
        }
    }

    void markAsHit(Cell cell) {
        cell.setShipOnCell(false);
        cell.setWasTargeted(true);
        cell.setShipDestroyed(true);
        shipsRemaining--;
    }

    void markAsMiss(Cell cell) {
        cell.setWasTargeted(true);
    }

}
