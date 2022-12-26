package Mod13_Collections_Generics;

/*
Подключение к системе
*/

import java.util.Arrays;

public class Solution_13_9 {
    public final static Planet LULG;

    static {
        LULG = new Planet("Лулг");
        LULG.stations = new Planet.OrbitalStation[]{new Planet.OrbitalStation("Большое Орбитальное Кольцо")};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConnection(LULG)));
    }

    public static int[] getConnection(Planet planet) {
        int[] coordinates = new int[2];
        boolean flag = false;
        for (int i = 0; i < planet.stations.length; i++) {
            for (int j = 0; j < planet.stations[i].controlSystem.getInterfacesNumber(); j++) {
                if (planet.stations[i].controlSystem.connect(j) == Boolean.TRUE) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                    flag = true;
                }
            }
        }
        if (flag) {
            return coordinates;
        }
        else {
            return null;
        }
    }
}
