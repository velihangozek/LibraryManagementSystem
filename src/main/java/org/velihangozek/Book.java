package org.velihangozek;

/**
 * Represents a book in the library.
 * Evaluation Form Q1: Book class implementation.
 */
public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isBorrowed;

    // Constructor: initializes a new Book instance.
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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

    // Getter for the book ISBN.
    public String getIsbn() {
        return isbn;
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
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nBorrowed: " + (isBorrowed ? "Yes" : "No");
    }
}