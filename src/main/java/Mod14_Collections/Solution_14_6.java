package Mod14_Collections;

/*
Вирусы в Инстаматрице
*/

import java.util.HashSet;
import java.util.Set;

public class Solution_14_6 {

    public static Set<String> matrixLogs = new HashSet<>();

    public static void main(String[] args) {
        fillMatrixLog();
        removeBugs();
    }

    public static void removeBugs() {
        Set<String> logCopy = new HashSet<>(matrixLogs);
        for (String bugs :
                logCopy) {
            if (bugs.contains("buahaha")) {
                matrixLogs.remove(bugs);
            }
        }
    }

    public static void fillMatrixLog() {
        for (int i = 0; i < 400; i++) {
            matrixLogs.add("interestingLog" + i + ".log");
            if ((i > 0) && (i % 5 == 0) && (i < 295)) {
                matrixLogs.add("buahaha" + i + ".bug");
            }
        }
    }
}
