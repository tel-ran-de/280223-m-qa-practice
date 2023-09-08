package com.startainstitute.summary_0109;

import java.util.ArrayDeque;
import java.util.Queue;

public class CustomExecutorService {

    private final Queue<Runnable> queue;
    private final static Object MONITOR = new Object();
    private volatile boolean isShuttingDown = false;


    public CustomExecutorService(int threadsCount) {
        this.queue = new ArrayDeque<>();

        for (int i = 0; i < threadsCount; i++) {
            new Thread(() -> {
                while (true) {
                    Runnable task;
                    synchronized (MONITOR) {
                        while (true) {
                            task = queue.poll();
                            if (task != null) {
                                break;
                            }
                            if (isShuttingDown) {
                                return;
                            }
                            try {
                                MONITOR.wait(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    task.run();
                }
            }).start();
        }
    }

    public void execute(Runnable runnable) {
        synchronized (MONITOR) {
            queue.add(runnable);
            MONITOR.notify();
        }
    }

    public void shutdown() {
        isShuttingDown = true;
    }
}
