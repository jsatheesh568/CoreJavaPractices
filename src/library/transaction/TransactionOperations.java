package CoreJavaPractices.src.library.transaction;

import java.util.List;

public interface TransactionOperations {
    void borrowBook(String memberId, String bookId);
    void returnBook(String memberId, String bookId);
    List <String> getBorrowedBooks( String memberId);
}
