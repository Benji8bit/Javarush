package Features_mod9;

/*
Парадокс Диего
*/

public class Solution_9_19 {

    public static void main(String[] args) {
        Diego[] diegos = new Diego[99];
        for (int i = 0; i < diegos.length; i++) {
            diegos[i] = new Diego();
        }

        System.out.print(diegos[0].hashSum + " ^ ");
        Nimrod[] nimrods = dealWithDuplicates(diegos);
        System.out.println(nimrods[0].password + " = " + diegos[0].hashSum);
    }

    public static Nimrod[] dealWithDuplicates(Diego[] diegos) {

        Nimrod[] nimrods = new Nimrod[diegos.length];

        for (int i = 0; i < diegos.length; i++) {
            diegos[i].hashSum ^= i + 333;
            nimrods[i] = new Nimrod();
            nimrods[i].password = i + 333;

        }
        return nimrods;
    }
    // Проверь, что метод dealWithDuplicates
    // изменяет переменную hashSum всем объектам
    // в массиве diegos.
}
