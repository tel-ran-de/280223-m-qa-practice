package com.startainstitute.summary_3006;

public class ExchangerTest {

    public static void main(String[] args) {

        Exchanger exchanger = new Exchanger();

        new Thread(() -> {
            try {
                String otherMsg = exchanger.exchange("Msg 1");
                System.out.println("Thread 1 = " + otherMsg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                String otherMsg = exchanger.exchange("Msg 2");
                System.out.println("Thread 2 = " + otherMsg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
