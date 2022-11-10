/*
Путь через аномалию
*/

import java.util.Arrays;

public class Solution_9_4 {

    public static int[][] anomalySpace = new int[][]{
            {383, 961, 904}, {769, 887, 770}, {184, 608, 406}, {310, 821, 445}, {412, 908, 158},
            {562, 844, 573}, {260, 880, 230}, {635, 254, 756}, {816, 754, 508}, {947, 195, 379},
            {576, 678, 682}, {207, 653, 588}, {901, 315, 223}, {310, 561, 255}, {199, 356, 350},
            {971, 276, 974}, {413, 829, 494}, {344, 345, 322}, {889, 713, 222}, {628, 963, 234},
            {254, 428, 926}, {633, 762, 848}, {896, 130, 653}, {971, 636, 861}, {328, 976, 139}};

    public static double[] safeRoute = new double[25];


    public static void main(String[] args) {

        for (int i = 0, y = 0; i < anomalySpace.length; i++) {
            // System.out.print(anomalySpace[i][0] + " " + anomalySpace[i][1] + " " + anomalySpace[i][2] + " ");
            double safeDot = Math.sin(anomalySpace[i][0]) * Math.PI +
                    Math.cos(anomalySpace[i][1]) * Math.min(anomalySpace[i][0], Math.min(anomalySpace[i][1], anomalySpace[i][2])) +
                    (Math.tan(anomalySpace[i][1]) / Math.log(anomalySpace[i][2]));
            // System.out.println(safeDot);

            if ((safeDot >= 100) && (safeDot <= 200)) {
                safeRoute[y] = safeDot;
                y++;
            }
        }
        System.out.println(Arrays.toString(safeRoute));
    }
}