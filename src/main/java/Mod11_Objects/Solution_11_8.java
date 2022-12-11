package Mod11_Objects;

import java.util.Calendar;

/*
Текущий год
*/

public class Solution_11_8 {

    private int currentYear;

    public Solution_11_8() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution_11_8 solution = new Solution_11_8();
        System.out.println(solution.getCurrentYear());
    }
}
