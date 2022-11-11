package Functions_mod7;

import java.util.Scanner;

/*
Диабло (4)
*/

public class Solution_7_22 {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);

        findDiablo();

        battle();

        if (isAmigoWin()) System.out.println(winPhrase);
        else System.out.println(loosePhrase);
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (guess != diabloPosition) {
            System.out.println(getPositionPhrase);
            guess = sc.nextInt();
        }
        System.out.println(findDiabloPhrase);
    }

    public static void amigoLostLife() {
        amigoLives -= 1;
    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloDefends() {
        return getRandomNumber(3);
    }

    public static void battle() {
        while ((amigoLives != 0) && (diabloLives != 0)) {
            amigoAttacks();
            diabloDefends();
            if (amigoAttacks() == diabloDefends()) {
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            } else {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            }
        }
    }

    public static boolean isAmigoWin() {
        return diabloLives == 0;
    }

}
