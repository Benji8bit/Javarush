package Mod10_Strings;

/*
Освобождение Пиратов
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10_17 {

    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements();
        getStringFromArray();
        printArray(controlUnits);
    }

    public static void splitArrayElements() {
        for (int i = 0; i < controlUnits.length; i++) {
            StringTokenizer st = new StringTokenizer(controlUnits[i], "/");
            String token = "";
            while (st.hasMoreTokens()) {
                token = st.nextToken();
            }
            controlUnits[i] = token;
            //System.out.println(controlUnits[i]);
        }
        //System.out.println(Arrays.deepToString(controlUnits));
    }

    public static void getStringFromArray() {
        for (int i = 0; i < controlUnits.length; i++) {
            controlUnits[i] = String.format("Block %s back online.", controlUnits[i]);
        }
        //System.out.println(Arrays.deepToString(controlUnits));
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}

