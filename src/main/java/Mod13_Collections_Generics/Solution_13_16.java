package Mod13_Collections_Generics;

/*
Бой гладиаторов
*/

import java.util.Arrays;

public class Solution_13_16 {

    public static void main(String[] args) {
        Robot amigoRobot = new Robot(Arrays.asList(null, new Core(1), new Core(2), null,
                new Core(4), new Core(5), null, new Core(7), null, new Core(9)));
        Robot diegoRobot = new Robot(Arrays.asList(new Core(0), null, null, new Core(3), null,
                new Core(5), new Core(6), new Core(7), null, null));

        fixRobot(amigoRobot);
        fixRobot(diegoRobot);

        printRobot(amigoRobot);
        printRobot(diegoRobot);
    }

    public static void fixRobot(Robot robot) {
        for (int i = 0; i < robot.getCores().size(); i++) {
            if (robot.getCores().get(i) == null) {
                robot.getCores().set(i, new Core(i));
            }
        }
    }

    public static void printRobot(Robot robot) {
        for (int i = 0; i < robot.getCores().size(); i++) {
            System.out.println(robot.getCores().get(i).toString());
        }
    }
}
