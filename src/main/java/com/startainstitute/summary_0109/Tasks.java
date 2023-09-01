package com.startainstitute.summary_0109;

public class Tasks {

    // Задача 1:
    // Поочередная синхронизация. Два потока выводят сообщение на экран.

    /*
      Задача 0:
      Написать свой SimpleExchanger. Он должен выглядеть так:

      public class SimpleExchanger<T> {

            public T exchange(T msg) {}
      }

      При этом предполагается, что он будет вызван из двух потоков.

      Задача 1:
          Предположим что у вас есть класс Singleton, у которого есть приватный конструктор и статический метод:

          pubilc class Singleton {

            private Singleton() {
            }

            public static Singleton getOrCreate() {};
          }

          Напишите реализацию этого метода, который будет либо создавать объект Singleton, либо возвращать уже созданный. Ваше
          решение должно работать в многопоточном режиме. До первого вызова объект заранее создавать нельзя.

          Предложите простое решение и подумайте как его сделать эффективнее.
      Задача 2:
            Распределение задач для многопоточной обработки данных. Предположим у вас есть текстовый файл, который
            содержит записи в каждой строке. Ваш нужно написать класс, который выглядит так:

            public class FileProcessor {

                void process(File file, Processor processor) {};
            }

            interface Processor {
                void process(String line);
            }

            При этом реализация интерфейса Processor предполагает, что каждая строка может обрабатываться долго.
            Предложите решение для организации параллельной обработки строк файла в классе FileProcessor. Помните, что
            количество созданных Thread в реальных системах ограничено ресурсами комьютера. Как можно их ограничить?

            Напишите тесты для вашего решения.
       Задача 3:

        Напишите свой ExecutorService (упрощенный).
        Класс выглядит так:
        public class CustomExecutorService {

            public void execute(Runnable runnable) {}

            public void shutdown() {}
         }

         Объекты этого класса должны быть потокобезопасные (можно добавлять задачи из разных потоков). Кроме того,
         предусмотрите конфигурирование этого класса через конструктор (что можно конфигурировать?).
         При вызове shutdown потоки доделывают текущие задачи которые они уже взяли и останавливаются.

         Обратите внимание, что добавление задачи на обработку происходит быстро, мы не хотим дожидаться когда эта
         задача будет выполнена (как в настоящем ExecutorService).

     */

}
