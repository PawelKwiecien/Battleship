package pl.pawelkwiecien.battleship;

public class BoardCell {

    private boolean shipOnCell;
    private boolean wasTargeted;

    public BoardCell() {
        this.shipOnCell = false;
        this.wasTargeted = false;
    }

    public boolean shipOnCell() {
        return shipOnCell;
    }

    public void setShipOnCell(boolean shipOnCell) {
        this.shipOnCell = shipOnCell;
    }

    public boolean wasTargeted() {
        return wasTargeted;
    }

    public void setWasTargeted(boolean wasTargeted) {
        this.wasTargeted = wasTargeted;
    }
}
