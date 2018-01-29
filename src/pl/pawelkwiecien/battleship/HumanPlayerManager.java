package pl.pawelkwiecien.battleship;

class HumanPlayerManager extends PlayerManager{

    private boolean inPlay = true;
    private int shipsRemaining = 10;


    public boolean evaluateShot(Cell cell) {
        if (cell.wasTargeted()) {
            System.out.println("This cell was already targeted.\n");
            return true;
        } else if (!cell.hasShip() && !cell.wasTargeted()) {
            System.out.println("\nSorry, it's a miss.\n");
            markAsMiss(cell);
            return false;
        } else if (cell.hasShip()) {
            System.out.println("\nIt's a HIT!\n");
            markAsHit(cell);
            return true;
        }
        return true;
    }

}
