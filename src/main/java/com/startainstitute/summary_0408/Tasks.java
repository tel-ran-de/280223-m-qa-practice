package com.startainstitute.summary_0408;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("/Users/antonermak/workspace/file.csv")))) {

            String header = reader.readLine();

            List<String[]> dataRows = new ArrayList<>();

            while (reader.ready()) {
                String dataLine = reader.readLine();
                if (dataLine.isEmpty()) {
                    break;
                }
                String[] dataParts = dataLine.split(",");

                dataRows.add(dataParts);
            }

            System.out.println("Header = " + header);
            for (String[] dataRow : dataRows) {
                System.out.println("Data row = " + Arrays.toString(dataRow));
            }
        }
    }


    // Java Stream API:
    // Посчитать количество слов в предложении
    // Найти сумму четных чисел в коллекции
    // Разделить четные и нечетные числа на два списка

    // Работа с файлами?

    // Дизайн ООП
    // На вход дан CSV файл. Требуется написать модуль, который индексирует этот файл и предоставляет метод для поиска
    // индекса по значению
    // RowIndex find(fieldName: String, value: String)
    // , где RowIndex = Integer
    //
}


