package org.velihangozek;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of books in the library.
 * Evaluation Form Q2: Library class implementation.
 */
public class Library {
    private final List<Book> books;

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
        System.out.println("Viewing All Books => \n");
        System.out.println("--------------------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("--------------------"); // Separator between books.
        }
    }

    // Searches for a book by title (exact match - retained for backward compatibility).
    // Evaluation Form Q5: Searching for a book.
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Searches for books by title (partial matching, case-insensitive).
    public List<Book> searchBooks(String titlePart) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(titlePart.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Searches for a book by ISBN (case-insensitive).
    public Book searchBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Borrows a book using ISBN.
    // Evaluation Form Q6: Borrowing a book.
    public boolean borrowBook(String isbn) {
        Book book = searchBookByISBN(isbn);
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

    // Returns a borrowed book using ISBN.
    // Evaluation Form Q7: Returning a book.
    public boolean returnBook(String isbn) {
        Book book = searchBookByISBN(isbn);
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