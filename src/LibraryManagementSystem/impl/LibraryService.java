package CoreJavaPractices.src.LibraryManagementSystem.impl;

import CoreJavaPractices.src.LibraryManagementSystem.exception.LibraryException;
import CoreJavaPractices.src.LibraryManagementSystem.model.Book;
import CoreJavaPractices.src.LibraryManagementSystem.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryService implements LibraryOperations {
    private final Map<String, Book> bookCollection = new HashMap <> ();
    private final Map<String, User> users = new HashMap<>();
    private final Map <String, List <String> > borrowedBooks = new HashMap<>();

    // Add books & users
    public void addBook(Book book) {
        bookCollection.put(book.getBookId(), book);
    }

    public void addUser( User user) {
        users.put(user.getUserId(), user);
    }

    // Get all available books using Streams
    @Override
    public List<Book> getAvailableBooks() {
        return bookCollection.values().stream()
                .filter(Book::isAvailable)
                .collect( Collectors.toList());
    }

    // Borrow Book (with Exception Handling)
    @Override
    public void borrowBook(String userId, String bookId) {
        if (!users.containsKey(userId)) {
            throw new LibraryException("User not found: " + userId);
        }
        if (!bookCollection.containsKey(bookId)) {
            throw new LibraryException("Book not found: " + bookId);
        }
        Book book = bookCollection.get(bookId);
        if (!book.isAvailable()) {
            throw new LibraryException ("Book is already borrowed: " + book.getTitle());
        }

        book.borrowBook();
        borrowedBooks.computeIfAbsent(userId, k -> new ArrayList <> ()).add(bookId);
        System.out.println(users.get(userId).getName() + " borrowed " + book.getTitle());
    }

    // Return Book
    @Override
    public void returnBook(String userId, String bookId) {
        if (!borrowedBooks.containsKey(userId) || !borrowedBooks.get(userId).contains(bookId)) {
            throw new LibraryException("No record of this book being borrowed by user: " + userId);
        }
        bookCollection.get(bookId).returnBook();
        borrowedBooks.get(userId).remove(bookId);
        System.out.println(users.get(userId).getName() + " returned " + bookCollection.get(bookId).getTitle());
    }
}
