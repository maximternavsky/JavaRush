package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1993, 3, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        switch (calendar.getTime().getDay()){
            case 1 :
                return "Понедельник";
            case 2 :
                return "Вторник";
            case 3 :
                return "Среда";
            case 4 :
                return "Четверг";
            case 5 :
                return "Пятница";
            case 6 :
                return "Суббота";
            case 0 :
                return "Воскресенье";
        }

        return null;
    }
}
