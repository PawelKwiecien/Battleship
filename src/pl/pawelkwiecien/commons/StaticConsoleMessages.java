package pl.pawelkwiecien.commons;

public class StaticConsoleMessages {

    private static final String THIS_CELL_WAS_ALREADY_TARGETED = "This cell was already targeted.\n";
    private static final String SORRY_IT_S_A_MISS = "\nSorry, it's a miss.\n";
    private static final String ITS_A_HIT = "\nIt's a HIT!\n";
    private static final String GAME_OVER = "\nGAME OVER!";
    private static final String I_SHOOT_AT = "COMPUTER : I shoot at: ";
    private static final String DID_I_HIT_YOU = "\nDid I hit You? (y/n)";
    private static final String TAKE_A_SHOT = "Take a shot: ";
    private static final String INVALID_CELL_NUMBER = "Invalid cell number.\n";
    private static final String COLUMN_NAMES = "   [A][B][C][D][E][F][G][H]";


    public static void printWasTargeted() {
        System.out.println(THIS_CELL_WAS_ALREADY_TARGETED);
    }


    public static void printMissed() {
        System.out.println(SORRY_IT_S_A_MISS);
    }


    public static void printHit() {
        System.out.println(ITS_A_HIT);
    }


    public static void printTakeAShot() {
        System.out.println(TAKE_A_SHOT);
    }


    public static void printInvalidCellNumber() {
        System.out.println(INVALID_CELL_NUMBER);
    }


    public static void printGameOver() {
        System.out.println(GAME_OVER);
    }


    public static void printComputerQuery(char column, char row) {
        System.out.println(I_SHOOT_AT + (char) column + row + DID_I_HIT_YOU);
    }


    public static void printColumnNames() {
        System.out.println(COLUMN_NAMES);
    }


    public static void printRowName(int columnIndex) {
        System.out.print("[" + (columnIndex + 1) + "]");
    }

}
