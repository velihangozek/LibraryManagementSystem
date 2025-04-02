package org.velihangozek;

// File: Library.java

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of books in the library.
 * Evaluation Form Q2: Library class implementation.
 */
public class Library {
    private List<Book> books;

    // Constructor: initializes the library's book collection.
    public Library() {
        books = new ArrayList<>();
    }

    // Adds a new book to the library.
    // Evaluation Form Q3: Adding a new book.
    public void addBook(Book book) {
        books.add(book);
    }

    // Displays all books in the library.
    // Evaluation Form Q4: Viewing all books.
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Searches for a book by title (case insensitive).
    // Evaluation Form Q5: Searching for a book.
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Borrows a book if available.
    // Evaluation Form Q6: Borrowing a book.
    public boolean borrowBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
            return false;
        }
        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return false;
        }
        book.borrow();
        System.out.println("Book borrowed successfully.");
        return true;
    }

    // Returns a borrowed book.
    // Evaluation Form Q7: Returning a book.
    public boolean returnBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
            return false;
        }
        if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed.");
            return false;
        }
        book.returnBook();
        System.out.println("Book returned successfully.");
        return true;
    }
}