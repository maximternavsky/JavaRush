package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ivan", 5.0);
        grades.put("Kolyan", 4.3);
        grades.put("Vityok", 3.3);
        grades.put("Katyha", 2.3);
        grades.put("Zinka", 1.3);
    }
}
