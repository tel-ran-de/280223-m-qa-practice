package com.startainstitute.summary_0109;

public class SimpleExchangerExample {

    public static void main(String[] args) {
        SimpleExchanger<String> simpleExchanger = new SimpleExchanger<>();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 printed: " + simpleExchanger.exchange("Msg from thread 1"));
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 printed: " + simpleExchanger.exchange("Msg from thread 2"));
        });
        thread2.start();
    }
}
