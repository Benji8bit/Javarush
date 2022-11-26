package Mod10_Strings;

public class MathExample2 {

    public static void main(String[] args) {
        System.out.println(squareDigits(153));
    }

    public static int squareDigits(int n) {
        String strNumber = "";
        int square;
        while (n > 0) {
            square = (n%10) * (n%10);
            n = (int) n/10;
            strNumber = Integer.toString(square) + strNumber;
        }
        return Integer.parseInt(strNumber);
    }
}