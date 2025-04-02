package org.velihangozek;

import java.util.List;
import java.util.Scanner;

/**
 * Main class for the Library Management System.
 * Contains the main menu and handles user interactions.
 * Evaluation Form Q8: Main method and console interaction.
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            // Display the menu options.
            System.out.println("\n=== Library Management System ===\n");
            System.out.println("1. Add a new book");
            System.out.println("2. View all books");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Borrow a book (by ISBN)");
            System.out.println("5. Return a book (by ISBN)");
            System.out.println("6. Exit\n");
            System.out.print("Enter your choice: ");

            // Read user input.
            try {
                choice = Integer.parseInt(scanner.nextLine());
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            switch(choice) {
                case 1:
                    // Add a new book.
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    // View all books.
                    library.viewBooks();
                    break;
                case 3:
                    // Search for a book by title (partial matching).
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    List<Book> foundBooks = library.searchBooks(searchTitle);
                    if (!foundBooks.isEmpty()) {
                        System.out.println("\nBooks found: \n");
                        for (Book book : foundBooks) {
                            System.out.println("--------------------");
                            System.out.println(book);
                        }
                        System.out.println("--------------------");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    // Borrow a book by ISBN.
                    System.out.print("Enter book ISBN to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;
                case 5:
                    // Return a book by ISBN.
                    System.out.print("Enter book ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 6:
                    // Exit the program.
                    System.out.println("Thank you for using the Library Management System by Velihan Gözek :) Hope to see you again - Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println(); // Blank line for better readability.
        } while(choice != 6);

        scanner.close();
    }
}