package com.javarush.task.pro.task15.task1521;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru");
        URLConnection connection = url.openConnection();

// отправляем данные
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output))
        {
            sender.println("Привет");
        }

// читаем данные
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
    }
}