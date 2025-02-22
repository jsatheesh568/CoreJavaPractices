package CoreJavaPractices.src.library.book;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import CoreJavaPractices.src.library.book.LibraryBook;
import java.util.stream.Collectors;

public class BookRepository implements BookOperations {
  private final List<LibraryBook> books = new ArrayList<>();

  @Override
  public void addBook(LibraryBook book) {
    books.add(book);
  }

  @Override
  public Optional<LibraryBook> findBook(String id) {
    return books.stream().filter(book -> book.id().equals(id)).findFirst();
  }

  @Override
  public List<LibraryBook> getBooksByCategory(Category category) {
    return books.stream()
        .filter(book -> book.category().equals(category))
        .collect(Collectors.toList());
  }
}
