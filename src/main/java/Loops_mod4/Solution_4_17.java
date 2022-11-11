package Loops_mod4;/*
Диггер (1)
*/

public class Solution_4_17 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        //напишите тут ваш код
        for (int j=0; j<10; j++) {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                if ((j==0)&&(i==3)) {
                    System.out.print(robot);
                    continue;
                }
                if (j==9) {
                    System.out.print(bug);
                    continue;
                }
                System.out.print(land);
            }
        }
    }
}
