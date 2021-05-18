package com.javarush.task.task16.task1611;

/* 
Часы
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("1", 500);
        Clock clock2 = new Clock("2", 1200);
        Clock clock3 = new Clock("33333", 5000);
        Clock clock4 = new Clock("4444444", 10200);
        Thread.sleep(15000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        String s;
        int t;
        public Clock(String s, int t) {
            this.s = s;
            this.t = t;
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            System.out.println(s);
            Thread.sleep(t);

        }
    }
}
