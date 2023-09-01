package com.startainstitute.summary_0109;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSyncExample {

    private static boolean isLeft = true;


    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        Condition waitCondition = reentrantLock.newCondition();

        Thread thread1 = new Thread(() -> {
            while (true) {
                reentrantLock.lock();
                try {
                    if (isLeft) {
                        printWithTimestamp("Thread 1");
                        sleep(1000);
                        isLeft = false;
                        waitCondition.signal();
                    } else {
                        try {
                            waitCondition.await();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            while (true) {
                reentrantLock.lock();
                try {
                    if (!isLeft) {
                        printWithTimestamp("Thread 2");
                        sleep(1000);
                        isLeft = true;
                        waitCondition.signal();
                    } else {
                        try {
                            waitCondition.await();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    }
                } finally {
                    reentrantLock.unlock();
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
