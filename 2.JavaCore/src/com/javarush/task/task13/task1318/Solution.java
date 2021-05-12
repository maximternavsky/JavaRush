package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedReader reader = new BufferedReader(new FileInputStream(scanner.nextLine()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}