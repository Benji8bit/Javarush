/*
Бесконечность не предел
*/

public class Solution_8_5 {
    public static void main(String[] args) {
        div(0, 1);
        div (0, -1);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}