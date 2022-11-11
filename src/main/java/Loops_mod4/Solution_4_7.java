package Loops_mod4;/*
Сумма чисел, не кратных 3
*/

public class Solution_4_7 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        int sum = 0;
        while (i<=100) {
            if ((i%2)!=0) {
                i++;
                continue;
            }
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}

