package Mod10_Strings;

/*
Кодировка Unicode
*/

public class Solution_10_8 {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            switch (i) {
                case (0):
                    symbols[i] = '\u00A9';
                    break;
                case (1):
                    symbols[i] = '\u004A';
                    break;
                case (2):
                    symbols[i] = '\u0061';
                    break;
                case (3):
                    symbols[i] = '\u0076';
                    break;
                case (4):
                    symbols[i] = '\u0061';
                    break;
                case (5):
                    symbols[i] = '\u0052';
                    break;
                case (6):
                    symbols[i] = '\u0075';
                    break;
                case (7):
                    symbols[i] = '\u0073';
                    break;
                case (8):
                    symbols[i] = '\u0068';
                    break;
                default:
                    break;
            }
        }
    }
}

