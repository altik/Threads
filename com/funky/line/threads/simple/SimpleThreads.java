package com.funky.line.threads.simple;

/**
 * Created by Rudniev Oleksandr on 10.12.2016.
 */
public class SimpleThreads {

    public static int version = 0;

    public static void main(String[] args) {
        System.out.println("Main started");

        new Thread(new Runnable() {
            @Override
            public void run() {
                version++;
                System.out.println("Version=" + version);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                version--;
                System.out.println("Version=" + version);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Separated thread 3 ");
            }
        }).start();

        System.out.println("Main finished");
    }
}
