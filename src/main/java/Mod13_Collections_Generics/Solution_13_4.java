package Mod13_Collections_Generics;

/*
Плата по счетам
*/

public class Solution_13_4 {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }
}

