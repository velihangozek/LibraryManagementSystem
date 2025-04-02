# Library Management System

A Java-based console application designed as a capstone project to manage a library's collection of books. This project demonstrates object-oriented programming concepts, collections, and console input/output handling.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Usage](#usage)
- [Additional Information](#additional-information)

## Features

- **Add a New Book:**  
  Add a book by entering its title, author, and ISBN.

- **View All Books:**  
  List all books with details including title, author, ISBN, and borrowed status. Each book is separated by a divider for clarity.

- **Search by Title:**  
  Perform partial matching searches to find books by title (case-insensitive).

- **Borrow a Book:**  
  Borrow a book using its ISBN. The system ensures that a book cannot be borrowed if it is already checked out.

- **Return a Book:**  
  Return a previously borrowed book by providing its ISBN.

- **Exit:**  
  Continue interacting with the menu until you choose to exit the application.

## Technologies Used

- **Java 21:** Core Java, Collections Framework, and Scanner for input handling.
- **Console Application:** Designed to run in a terminal/command prompt environment.

## Project Structure

The project follows a standard Java package structure:

```
LibraryManagementSystem/ 
├── src/ 
    │ 
    └── org/velihangozek/ 
            │ 
            ├── Book.java 
            │ 
            ├── Library.java 
            │ 
            └── LibraryManagementSystem.java 
├── README.md
```

## How to Run

1. **Compile the Project:**

   Open your terminal in the project directory and run:

   ```bash
   javac org/velihangozek/*.java
   ```

2. **Run the Application:**

   ```bash
   java org.velihangozek.LibraryManagementSystem
   ```

## Usage

    
    After launching the application, follow the on-screen menu:

    Add a New Book:
    Enter the book's title, author, and ISBN when prompted.

    View All Books:
    Display the list of books with full details and status.

    Search for a Book by Title:
    Enter a part or full title to search for matching books.

    Borrow a Book (by ISBN):
    Input the ISBN of the book you wish to borrow.

    Return a Book (by ISBN):
    Input the ISBN of the book you wish to return.

    Exit:
    Select the exit option to terminate the application.
    

## Additional Information

    **Naming Conventions:**

        - All variable and method names follow standard industry practices and are in English.
    
    **Documentation:**

        - The source code includes comments referencing evaluation form sections for clarity and additional documentation.

    **IDE Compatibility:**

        - The project is fully compatible with IDEs such as IntelliJ IDEA and Visual Studio Code.