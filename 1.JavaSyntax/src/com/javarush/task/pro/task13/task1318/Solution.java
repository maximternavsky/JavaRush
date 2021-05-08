package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] arr = Month.values();
        if(month.ordinal() == arr.length-1){
            return arr[0];
        } else {
            return arr[month.ordinal() + 1];
        }
    }
}
