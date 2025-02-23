package CoreJavaPractices.src.LibraryManagementSystem.impl;

import CoreJavaPractices.src.LibraryManagementSystem.model.Book;

import java.util.List;

public interface LibraryOperations {
    void borrowBook(String userId, String bookId);
    void returnBook(String userId, String bookId);
    List < Book > getAvailableBooks();
}
