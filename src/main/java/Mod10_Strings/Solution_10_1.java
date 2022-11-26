package Mod10_Strings;

/*
Целочисленные литералы
*/

public class Solution_10_1 {
    public byte b = -128;
    public short s = -32768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;


    public String text = "Всегда пишите код так, "
    + "будто сопровождать его будет "
    + "склонный к насилию психопат, "
    + "который знает, где вы живете. "
    + "Martin Golding";

    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }

}