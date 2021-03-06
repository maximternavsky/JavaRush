package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tk = new StringTokenizer(query, delimiter);
        String str[] = new String[tk.countTokens()];
        int count = 0;
        while (tk.hasMoreTokens())
        {
            str[count] = tk.nextToken();
            count++;
        }
        return str;
    }
}
