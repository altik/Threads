package com.funky.line.threads.simple;

/**
 * Created by Rudniev Oleksandr on 10.12.2016.
 */
public class Executer {
    public static void main(String[] args) {
        ProduserConsumer pc = new ProduserConsumer();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
