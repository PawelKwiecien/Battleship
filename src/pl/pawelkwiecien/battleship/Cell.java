package pl.pawelkwiecien.battleship;

class Cell {

    private boolean shipOnCell;
    private boolean wasTargeted;

    Cell() {
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
