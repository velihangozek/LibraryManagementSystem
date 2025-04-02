package org.velihangozek;

// File: Book.java

/**
 * Represents a book in the library.
 * Evaluation Form Q1: Book class implementation.
 */
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor: initializes a new Book instance.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // The book is available by default.
    }

    // Getter for the book title.
    public String getTitle() {
        return title;
    }

    // Getter for the book author.
    public String getAuthor() {
        return author;
    }

    // Checks if the book is borrowed.
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Marks the book as borrowed.
    public void borrow() {
        this.isBorrowed = true;
    }

    // Marks the book as returned.
    public void returnBook() {
        this.isBorrowed = false;
    }

    // Returns a string representation of the book.
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }
}