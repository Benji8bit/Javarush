package Loops_mod4;

public class Solution_4_3 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;

        while (i<10) {
            int n = 0;
            if ((i==0)||(i==9)) {
            while (n<20) {
                    System.out.print("Б");
                    n++;
                }
            }
            else if ((i>0)||(i<4)) {
                while (n<20) {
                    if ((n == 0) || (n == 19)) {
                        System.out.print("Б");
                        n++;
                    }
                    else if ((n > 0) || (n < 19)) {
                    System.out.print(" ");
                    n++;
                    }
                }
            }
            System.out.println();
            i++;
        }
    }
}