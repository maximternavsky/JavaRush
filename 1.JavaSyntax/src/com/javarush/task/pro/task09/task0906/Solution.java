package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if(decimalNumber > 0){
            String vosm = "";
            int i = 0;
            while(decimalNumber != 0){
                vosm += decimalNumber % 2;
                decimalNumber /= 2;
                i++;
            }
            return vosm;
        }
        return "";
    }

    public static int toDecimal(String binaryNumber) {
        if(binaryNumber == "" || binaryNumber == null){
            return 0;
        }
        if(binaryNumber.length() > 0) {
            int dec = 0;
            int temp = 0;
            char[] ch = binaryNumber.toCharArray();
            for (int i = 0; i < binaryNumber.length(); i++) {
                if (ch[i] == '1') {
                    temp = 1;
                } else {
                    temp = 0;
                }
                dec += temp * Math.pow(2, i);
            }
            return dec;
        }

        return 0;
    }
}
