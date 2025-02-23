package CoreJavaPractices.src.LibraryManagementSystem.model;

public class Book {
    private final String bookId;
    private final String title;
    private boolean isAvailable;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() { this.isAvailable = false; }
    public void returnBook() { this.isAvailable = true; }

    @Override
    public String toString() {
        return "Book{" + "ID='" + bookId + "', Title='" + title + "', Available=" + isAvailable + '}';
    }
}
