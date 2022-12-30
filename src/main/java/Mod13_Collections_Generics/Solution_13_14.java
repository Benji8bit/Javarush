package Mod13_Collections_Generics;

import java.util.ArrayList;
import java.util.Arrays;

/*
Аккаунт ИнстаМатрицы
*/

public class Solution_13_14 {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String s : accountsList) {
            System.out.println(s.toString());
        }
    }

    public static void convertAccounts() {
        for (int i = 0; i < Accounts.getAccounts().length; i++) {
            accountsList.add(Accounts.getAccounts()[i]);
        }
    }

    public static void registerAccount(String username) {
        if (!accountsList.contains(username)) {
            accountsList.add(username);
        }
    }
}
