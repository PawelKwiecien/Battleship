package pl.pawelkwiecien.commons;

public class StaticSupportMethods {

    private static final int FIRST_ROW_NUMBER_IN_ASCII = 49;
    private static final int LAST_ROW_NUMBER_IN_ASCII = 56;
    private static final int FIRST_COLUMN_LETTER_IN_ASCII = 97;
    private static final int LAST_COLUMN_LETTER_IN_ASCII = 104;
    private static final int FIRST_CHARACTER_FROM_INPUT = 0;
    private static final int SECOND_CHARACTER_FROM_INPUT = 1;
    private static final int MAX_INPUT_LENGTH = 2;


    public static boolean isValid(String input) {
        if (input.length() < MAX_INPUT_LENGTH) {
            return false;
        } else {
            return input.charAt(FIRST_CHARACTER_FROM_INPUT) >= FIRST_COLUMN_LETTER_IN_ASCII &&
                    input.charAt(FIRST_CHARACTER_FROM_INPUT) <= LAST_COLUMN_LETTER_IN_ASCII &&
                    input.charAt(SECOND_CHARACTER_FROM_INPUT) >= FIRST_ROW_NUMBER_IN_ASCII &&
                    input.charAt(SECOND_CHARACTER_FROM_INPUT) <= LAST_ROW_NUMBER_IN_ASCII &&
                    input.length() == MAX_INPUT_LENGTH;
        }
    }


    public static int generateColumn(String input) {
        return (input.charAt(FIRST_CHARACTER_FROM_INPUT) - FIRST_COLUMN_LETTER_IN_ASCII);
    }


    public static int generateRow(String input) {
        return (input.charAt(SECOND_CHARACTER_FROM_INPUT) - FIRST_ROW_NUMBER_IN_ASCII);
    }

}
