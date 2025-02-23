package CoreJavaPractices.src.LibraryManagementSystem;

import CoreJavaPractices.src.LibraryManagementSystem.impl.LibraryService;
import CoreJavaPractices.src.LibraryManagementSystem.model.Book;
import CoreJavaPractices.src.LibraryManagementSystem.model.User;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        // Adding Books
        Book book1 = new Book ("B101", "Clean Code");
        Book book2 = new Book("B102", "Java Concurrency in Practice");
        libraryService.addBook(book1);
        libraryService.addBook(book2);

        // Adding Users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");
        libraryService.addUser(user1);
        libraryService.addUser(user2);

        // Display available books
        System.out.println("\nAvailable Books: " + libraryService.getAvailableBooks());

        // Borrowing Books
        libraryService.borrowBook("U001", "B101");

        // Display available books after borrowing
        System.out.println("\nAvailable Books after borrowing: " + libraryService.getAvailableBooks());

        // Returning Books
        libraryService.returnBook("U001", "B101");

        // Display available books after returning
        System.out.println("\nAvailable Books after returning: " + libraryService.getAvailableBooks());

        // Handling an Exception (Uncomment to test)
        // libraryService.borrowBook("U003", "B101"); // Throws LibraryException (User not found)
    }
}
