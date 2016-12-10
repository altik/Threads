package com.funky.line.threads.simple;

/**
 * Created by Rudniev Oleksandr on 10.12.2016.
 */
public class ProduserConsumer {
    int[] arr = new int[5];
    int index = 0;

    public synchronized void produce() throws InterruptedException {
        while (true){
            if (index >= arr.length)
                wait();
            arr[index++] = 1;
            System.out.println(index);
            notify();

        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true){
            if (index == 0)
                wait();
            arr[--index] = 0;
            System.out.println(index);
            notify();
        }
    }


}
