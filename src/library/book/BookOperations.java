package CoreJavaPractices.src.library.book;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface BookOperations {
    void addBook(LibraryBook book);


    Optional<LibraryBook> findBook(String id);

    List<LibraryBook> getBooksByCategory(Category category);
}
