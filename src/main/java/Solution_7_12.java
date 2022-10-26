/*
Кубический калькулятор в кубе
*/

public class Solution_7_12 {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2));
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        long cube = cube(a);
        return cube(cube);
    }
}
