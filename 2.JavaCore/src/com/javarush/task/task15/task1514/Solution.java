package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(25.3, "lala");
        labels.put(25.1, "lal");
        labels.put(25.9, "la");
        labels.put(25.8, "l");
        labels.put(25.4, "l5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
