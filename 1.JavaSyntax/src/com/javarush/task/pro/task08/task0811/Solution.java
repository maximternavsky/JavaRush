package com.javarush.task.pro.task08.task0811;

/* 
Побитовые операции
*/

public class Solution {

    public static void main(String[] args) {
        int x = 12;
        int y = 7;
        //x = x & 25;
        x = x ^ y;
        y = x & y;
        //x = x & 3;
        //x = x & 12;
        //x = x | 1;
        System.out.println(x);
        System.out.println(y);
    }
}
