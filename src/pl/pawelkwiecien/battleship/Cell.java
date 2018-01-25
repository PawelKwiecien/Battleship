package pl.pawelkwiecien.battleship;

class Cell {

    private boolean shipOnCell;
    private boolean wasTargeted;
    private boolean shipDestroyed;

    Cell() {
        this.shipOnCell = false;
        this.wasTargeted = false;
        this.shipDestroyed = false;
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

    public boolean isShipDestroyed() {
        return shipDestroyed;
    }

    public void setShipDestroyed(boolean shipDestroyed) {
        this.shipDestroyed = shipDestroyed;
    }
}
