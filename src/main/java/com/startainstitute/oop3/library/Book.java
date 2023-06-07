package com.startainstitute.oop3.library;

public class Book {

    private String title;
    private String author;
    private BookGenre bookGenre;

    public Book(String title,
                String author,
                BookGenre bookGenre) {
        this.title = title;
        this.author = author;
        this.bookGenre = bookGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
