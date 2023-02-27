package Mod14_Collections;

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winterMonths = {DECEMBER, JANUARY, FEBRUARY};
        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] springMonths = {MARCH, APRIL, MAY};
        return springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonths = {JUNE, JULY, AUGUST};
        return summerMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumnMonths = {SEPTEMBER, OCTOBER, NOVEMBER};
        return autumnMonths;
    }
}

