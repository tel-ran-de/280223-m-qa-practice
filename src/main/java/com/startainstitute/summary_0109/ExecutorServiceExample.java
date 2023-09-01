package com.startainstitute.summary_0109;

public class ExecutorServiceExample {

//    public static final Object MONITOR = new Object();

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(16);

        Object monitor1 = new Object();
        Object monitor2 = new Object();
//
//        new Thread(() -> {
//            new CustomRunnable1();
//        }).start();
//
//        new Thread(() -> {
//            new CustomRunnable2();
//        }).start();

        SyncProcessor syncProcessor = new SyncProcessor();

        new Thread(() -> {
            syncProcessor.process(monitor1);
        }).start();

        new Thread(() -> {
            syncProcessor.process(monitor2);
        }).start();

    }
}

class CustomRunnable1 implements Runnable {

    @Override
    public void run() {
        Class<ExecutorServiceExample> executorServiceExampleClass = ExecutorServiceExample.class;
        synchronized (executorServiceExampleClass) {
            operation();
        }
    }

    private void operation() {
        System.out.println("Msg CustomRunnable1");
    }
}

class CustomRunnable2 implements Runnable {

    @Override
    public void run() {
        synchronized (ExecutorServiceExample.class) {
            operation();
        }
    }

    private void operation() {
        System.out.println("Msg from CustomRunnable2");
    }
}
