package pl.pawelkwiecien.battleship;

class StaticSupportMethods {

    static boolean isValid(String input) {
        if (input.charAt(0) >= 97 && input.charAt(0) <= 104 &&
                input.charAt(1) >= 49 && input.charAt(1) <= 56 &&
                input.length() == 2) {
            return true;
        }
        return false;
    }

    static int generateRow(String input) {
        return (input.charAt(1) - 49);
    }

    static int generateColumn(String input) {
        return (input.charAt(0) - 97);
    }

}
