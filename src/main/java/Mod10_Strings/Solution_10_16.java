package Mod10_Strings;

/*
String pool
*/

public class Solution_10_16 {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String s1 = first.intern();
        String s2 = second.intern();
        return s1==s2;
    }
}