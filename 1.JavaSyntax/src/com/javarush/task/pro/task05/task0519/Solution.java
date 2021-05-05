package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int arr2[] = Arrays.copyOfRange(array,0,array.length);
        Arrays.sort(arr2);
        Arrays.binarySearch(array, element);
        System.out.println(Arrays.binarySearch(arr2, element) >= 0 ? true : false);
    }
}
