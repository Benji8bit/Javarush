package Mod10_Strings;

/*
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi2 {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {

        for (PastryLoader pastryLoader : pastryLoaders) {
            for (int i = 0; i < pastryLoader.memory.length; i++) {
                for (int j = 0; j < pastryLoader.memory[i].length; j++) {
                    for (int k = 0; k < pastryLoader.memory[i][j].length; k++) {
                        pastryLoader.memory[i][j][k] = pastryLoader.memory[i][j][k] .replaceAll("(?i)nimrod", "pirate ship");
                    }
                }
            }
        }
    }
}