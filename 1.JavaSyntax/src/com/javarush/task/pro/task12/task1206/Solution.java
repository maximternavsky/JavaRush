package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] arr = string.toCharArray();
        for (char i : arr) {
            if (Character.isDigit(i)){
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] arr = string.toCharArray();
        for (char i : arr) {
            if (Character.isLetter(i)){
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] arr = string.toCharArray();
        for (char i : arr) {
            if (Character.isWhitespace(i)){
                count++;
            }
        }
        return count;
    }
}
