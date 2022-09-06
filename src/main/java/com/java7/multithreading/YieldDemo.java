package com.java7.multithreading;

/**
 * @author rohangupta
 */
public class YieldDemo {
    public static void main(String[] args) {
        Runnable producer = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am Producer : Produced Item " + i);
                Thread.yield();
            }
        };
        Thread producerThread = new Thread(producer);
        Runnable consumer = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am Consumer : Consumed Item " + i);
                Thread.yield();
            }
        };
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}



