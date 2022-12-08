package Mod11_Objects;

/*
Взлом ретранслятора
*/

import java.sql.SQLOutput;

public class Solution_11_4 {

    public static void main(String[] args) {
        Repeater repeater = new Repeater();

        System.out.println(repeater.getFrequency());
        if (repeater.getFrequency() < 100) {
            repeater.setFrequency(repeater.getFrequency() * 10);
        }
        System.out.println(repeater.getFrequency());

        System.out.println(repeater.getTrajectory());
        if (!repeater.getTrajectory().equalsIgnoreCase("elliptic"))
            repeater.setTrajectory("elliptic");
        System.out.println(repeater.getTrajectory());

    }
}
