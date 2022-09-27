/* 
Диггер (1)
*/

public class Solution_4_16 {
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
                System.out.print(land);
            }
        }
    }
}