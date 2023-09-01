package com.startainstitute.summary_0109;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class SyncronizedExample {

    private static final Object MONITOR = new Object();
    private static boolean isLeft = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (MONITOR) {
                    printWithTimestamp("Thread 1");
                    sleep(1000);
                    try {
                        MONITOR.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                    MONITOR.notify();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (MONITOR) {
                    printWithTimestamp("Thread 2");
                    sleep(1000);
                    MONITOR.notify();
                    try {
                        MONITOR.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();
    }

    private static void printWithTimestamp(String x) {
        System.out.println(Instant.now().truncatedTo(ChronoUnit.SECONDS) + " " + x);
    }

    private static void sleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
