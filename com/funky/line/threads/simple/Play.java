package com.funky.line.threads.simple;

/**
 * Created by Rudniev Oleksandr on 10.12.2016.
 */
public class Play extends Thread {
    public static void main(String[] args) {
        Players pl = new Players();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pl.doPing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pl.doPong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
