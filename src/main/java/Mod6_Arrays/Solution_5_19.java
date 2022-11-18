package Mod6_Arrays;/*
Создаем мультимассив
*/

public class Solution_5_19 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int n = 0; n < multiArray[i][j].length; n++) {
                    System.out.println(multiArray[i][j][n] + " ");
                }
            }
        }
    }
}
