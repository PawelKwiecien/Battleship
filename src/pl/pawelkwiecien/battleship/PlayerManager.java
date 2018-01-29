package pl.pawelkwiecien.battleship;

public class PlayerManager {

    private boolean inPlay = true;
    private int shipsRemaining = 10;

    public PlayerManager() {}


    public boolean inPlay() {
        return inPlay;
    }

    public void checkIfGameOver() {
        if (shipsRemaining == 0) {
            inPlay = false;
        }
    }

    public void markAsHit(Cell cell) {
        cell.setShipOnCell(false);
        cell.setWasTargeted(true);
        cell.setShipDestroyed(true);
        shipsRemaining--;
    }

    public void markAsMiss(Cell cell) {
        cell.setWasTargeted(true);
    }

}
