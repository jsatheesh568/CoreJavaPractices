package CoreJavaPractices.src.library.transaction;

import CoreJavaPractices.src.library.book.BookOperations;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TransactionService implements TransactionOperations {
  private final Map<String, Set<String>> borrowedBooks = new ConcurrentHashMap<>();
  private final BookOperations bookOperations;

  public TransactionService(BookOperations bookOperations) {
    this.bookOperations = bookOperations;
  }

  @Override
  public void borrowBook(String memberId, String bookId) {
    var book = bookOperations.findBook(bookId);
    if (book.isPresent()) {
      borrowedBooks.computeIfAbsent(memberId, k -> new HashSet<>()).add(bookId);
      System.out.println(memberId + " borrowed " + book.get().title());
    } else {
      System.out.println("Book not found!");
    }
  }

  @Override
  public void returnBook(String memberId, String bookId) {
    borrowedBooks.getOrDefault(memberId, Set.of()).remove(bookId);
    System.out.println(memberId + " returned " + bookId);
  }

  @Override
  public List<String> getBorrowedBooks(String memberId) {
    return new ArrayList<>(borrowedBooks.getOrDefault(memberId, Set.of()));
  }
}
