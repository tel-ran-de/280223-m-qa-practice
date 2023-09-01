package com.startainstitute.summary_2508;

import java.io.IOException;

public class Tasks {

    private static int a;
    private static int b;

    private volatile static int c;

    private static int d;

    private static final Object MONITOR = new Object();

    public static void main(String[] args) throws IOException, InterruptedException {
        Thread1 t = new Thread1();
        b = 2;
        a = -2;
        c = 3;
        d = 4;
        System.out.println(c); // c = 0

        t.start(); // memory barrier, happens before

        t.join(); // happens before

        // happens before:
        // volatile
        // monitor
        // lock in java.util.concurrent
        // Thread.join()
        // Thread.start()
        //

        System.out.println(c); // c == 3
        System.out.println(b); // b == 2
        System.out.println(a); // a == 1
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            a = 1;
            b = 2;
            synchronized (MONITOR) {
                c = 3;
            }
            // сделай всю память доступной для других потоков
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (MONITOR) {
                System.out.println(c); // c == 3
            }
            // мы должны увидеть все изменения которые были выполнены до "с".
            System.out.println(b); // b == 2
            System.out.println(a); // a == 1
        }
    }


    // Задача 1:
    // Требуется создать поток, который будет писать сообщение на экран раз в секунду.
    // Поток Main должен стартануть этот поток, подождать 10 секунд, остановить созданный поток и подождать пока
    // он завершится.

    // * напишите тест, чтобы проверить работу этой задачи.

    // Задача 2:
    // Требуется создать потокобезопасный класс, который отвечает за счётчик с суммой. Предложите две реализации.
    // Методы: increment()/decrement()/getOperationsCount()/getValue()

    // Задача 3:
    // Рассмотрим такой код:
    // Thread t = new Thread(() -> {
    //     System.out.println("Another thread");
    // });

    // t.start(); до start тоже ничего нельзя писать
    // System.out.println("Main thread");
    // t.join();

    // Как можно его изменить таким образом, чтобы гарантированно выводить сообщение на печать из потока до того,
    // как будет напечатано сообщение из Main треда? Операцию "t.join()" нельзя переносить куда-либо.
}
