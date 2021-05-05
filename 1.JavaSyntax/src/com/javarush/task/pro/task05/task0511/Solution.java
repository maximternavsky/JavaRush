package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int coll = cons.nextInt();

        for (int i = 0; i < coll; i++) {
            multiArray = new int[i][cons.nextInt()];
        }
    }
}
