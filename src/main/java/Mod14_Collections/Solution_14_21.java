package Mod14_Collections;

/*
Следующий месяц, пожалуйста
*/

public class Solution_14_21 {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        //System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        if (month.ordinal() == 11)
            return Month.values()[0];
        else
            return month.values()[month.ordinal() +1];
    }
}

