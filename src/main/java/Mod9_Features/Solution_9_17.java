package Mod9_Features;

/*
Инкременты
*/

public class Solution_9_17 {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}