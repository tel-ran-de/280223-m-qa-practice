package com.startainstitute.oop3.library;

public class Library {

    private Book[] books;
    private int currentPos;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.currentPos = 0;
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (currentPos == books.length) {
            System.out.println("Already 100 books added");
            return;
        }
        books[currentPos] = book;
        currentPos = currentPos + 1;
    }

    public Book[] searchBooksByGenre(BookGenre genre) {
        Book[] result = new Book[this.books.length];
        int i = 0;
        for (Book book : books) {
            if (book == null) {
                break;
            }
            if (book.getBookGenre() == genre) {
                result[i++] = book;
            }
        }

        return result;
    }
}
