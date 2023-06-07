package com.startainstitute.oop3.library;

import java.util.Arrays;

public class LibraryExample {

    public static void main(String[] args) {
        // Требуется спроектировать программу,
        // представляющую структуру библиотеки.
        // В неё можно добавлять книги и искать
        // книги определенных жанров.
        // Всего книг не больше 100.

//        Book[] bookArr;// = new Book[100];
//        bookArr[0] = new Book();

        Library library = new Library(100);

        library.addBook(new Book("English->German dictionary", "Smith", BookGenre.DICTIONARY));
        library.addBook(new Book("Some Roman", "Ivanov", BookGenre.ROMAN));
        library.addBook(new Book("Some Roman 2", "Vasilev", BookGenre.ROMAN));

        Book[] romanBooks = library.searchBooksByGenre(BookGenre.ROMAN);
        Book[] dictionaryBooks = library.searchBooksByGenre(BookGenre.DICTIONARY);

        System.out.println(Arrays.toString(dictionaryBooks));
    }
}
