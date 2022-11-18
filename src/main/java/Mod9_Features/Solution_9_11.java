package Mod9_Features;

/*
Counter

*/
public class Solution_9_11 {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if (i == 10) break;
            Thread.sleep(1, 300000);
        }
    }
}
