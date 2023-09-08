package com.startainstitute.summary_0809;

public class Tasks {

    /**
     Задача 1:
     Распределение задач для многопоточной обработки данных. Предположим у вас есть текстовый файл, который
     содержит записи в каждой строке. Ваш нужно написать класс, который выглядит так:

     public class FileProcessor {

     void processFile(File file, Processor processor) {};
     }

     interface Processor {
     void process(String line);
     }

     FileProcessor fileProcessor = new FileProcessor();
     fileProcessor.processFile("src/main/resources/emails.txt", (email) -> System.out.println("Send email to " + email));

     При этом реализация интерфейса Processor предполагает, что каждая строка может обрабатываться долго.
     Предложите решение для организации параллельной обработки строк файла в классе FileProcessor. Помните, что
     количество созданных Thread в реальных системах ограничено ресурсами комьютера. Как можно их ограничить?

     Напишите тесты для вашего решения.

     Задача 2.

     Вам требуется спроектировать класс, который занимается запуском задач для определенных типов данных.

     TypeProcessor typeProcessor = new TypeProcessor();

     typeProcessor.configureProcess(Car.class, car -> {
     System.out.println(car);
     });

     typeProcessor.configureProcess(Dog.class, car -> {
     System.out.println(car);
     });

     Dog dog = new Dog();

     Future<Void> taskResult = typeProccssor.runProcessAsync(dog); // запускает задачу асинхронно

     taskResult.get();

     typeProcessor.rynSync(car); // запускает задачу в текущем потоке
     **/

}
