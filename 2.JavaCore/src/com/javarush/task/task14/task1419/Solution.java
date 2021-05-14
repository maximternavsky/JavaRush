package com.javarush.task.task14.task1419;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new RuntimeException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NoSuchElementException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new InstantiationException());
        exceptions.add(new InterruptedException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IllegalAccessException());

    }
}
