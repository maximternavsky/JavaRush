package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of("/home/maxim/Downloads/l/");
        Path targetDirectory = Path.of("/home/maxim/Downloads/work/");
        try(DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)){
            for(Path path : files){
                if(Files.isRegularFile(path)){
                    Files.copy(path, Path.of((targetDirectory.toRealPath() + "/")));
                }  else {
                    continue;
                }  
            }    
        } catch (Exception e){
            System.out.println("BEDA");
        }
    }
}

