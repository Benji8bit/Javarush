package Mod11_Objects;

/*
Робозомби
*/

import java.util.Arrays;

public class Pepl {

    public static Battery[] batteryWarehouse = new Battery[999];

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        batteryWarehouse = Battery.getBatteries();
        for (int i = 0; i < robots.length; i++) {
            robots[i].replaceBattery(batteryWarehouse[i]);
            if (robots[i].getCharge() < 10)
                i--;
        }
    }
}

