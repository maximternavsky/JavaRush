package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static Month[] getWinterMonths(){
        Month[] arr= new Month[]{DECEMBER, JANUARY, FEBRUARY};
        return arr;
    }
    public static Month[] getSpringMonths(){
        Month[] arr= new Month[]{MARCH, APRIL, MAY};
        return arr;
    }
    public static Month[] getSummerMonths(){
        Month[] arr= new Month[]{JUNE, JULY, AUGUST};
        return arr;
    }
    public static Month[] getAutumnMonths(){
        Month[] arr= new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
        return arr;
    }

}
