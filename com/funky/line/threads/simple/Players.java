package com.funky.line.threads.simple;

/**
 * Created by Rudniev Oleksandr on 10.12.2016.
 */
class Players {

    public static final int PING = 1;
    public static final int PONG = 0;
    private int state = 0;

    synchronized void doPing() throws InterruptedException {
        while (true) {
            if (state == PING) {
                wait();
            }
            System.out.println("Ping");
            state = PING;
            notify();
        }
    }


    synchronized void doPong() throws InterruptedException {
        while (true) {
            if (state == PONG) {
                wait();
            }
            System.out.println("Pong");
            state = PONG;
            notify();
        }
    }
}


