package Loops_mod4;/*
Диггер (1)
*/

public class Solution_4_18 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        //напишите тут ваш код
        for (int j=0; j<10; j++) {

            for (int i = 0; i < 10; i++) {
                if ((i==3)&&(j==8)) {
                    System.out.print(robot);
                    continue;
                }
                else if ((i==3)&&(j!=9)) {
                    System.out.print(hole);
                    continue;
                }
                else if (j==9) {
                    System.out.print(bug);
                    continue;
                }
                else {
                    System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}
